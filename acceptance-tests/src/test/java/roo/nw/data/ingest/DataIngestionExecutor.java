/**
 * Copyright (C) 2017 Kelvin Yap https://www.linkedin.com/in/kelvin2014/
 * This file is part of northwind-roo.
 *
 * northwind-roo is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * northwind-roo is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with northwind-roo.  If not, see <http://www.gnu.org/licenses/>.
 */

package roo.nw.data.ingest;

import static java.util.Comparator.comparing;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

/**
 * Read data from
 * resources/roo/nw/autotest/data/fixtures/####/package.entity.yaml and ingest
 * into database.
 */
@Service
public class DataIngestionExecutor implements Runnable {

	private static final Log LOG = LogFactory.getLog(DataIngestionExecutor.class);

	@Autowired
	private EntityManager entityManager;

	@Autowired
	private EntityPersister entityPersister;

	@Override
	public void run() {
		LOG.debug("START ingesting data");
		for (EntityType<?> entity : entityManager.getMetamodel().getEntities()) {
			LOG.debug("ENTITY " + entity.getName());
		}

		List<File> folders = findFixtureFolders();
		if (null == folders || folders.isEmpty()) {
			return;
		}
		folders.forEach(this::processYamlFolder);

		LOG.debug("END ingesting data");
	}

	private void processYamlFolder(File fixtureFolder) {
		LOG.debug("Processing yaml folder " + fixtureFolder.getAbsolutePath());
		File[] children = fixtureFolder.listFiles();
		if (null == children || children.length < 1) {
			return;
		}
		List<File> yamlFiles = Arrays.asList(children).stream().filter(file -> file.isFile())
				.collect(Collectors.toList());
		if (null == yamlFiles || yamlFiles.isEmpty()) {
			return;
		}
		yamlFiles.forEach(this::processYamlFile);
	}

	private void processYamlFile(File yaml) {
		LOG.debug("Processing yaml file " + yaml.getAbsolutePath());
		String entityFullName = yaml.getName().substring(0, yaml.getName().lastIndexOf('.'));
		LOG.debug("Entity fully qualified class name " + entityFullName);

		try {
			Class.forName(entityFullName).newInstance();
		} catch (Exception e) {
			LOG.warn("Cannot create an entity from fully qualified class name " + entityFullName);
			return;
		}

		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		List<Object> entities;
		try {
			CollectionType collectionType = mapper.getTypeFactory().constructCollectionType(List.class,
					Class.forName(entityFullName));
			entities = mapper.readValue(yaml, collectionType);
		} catch (Exception e) {
			LOG.warn("Cannot convert from yaml to entity. " + e.getMessage());
			return;
		}
		if (null == entities || entities.isEmpty()) {
			return;
		}

		entities.forEach(entityPersister::persist);
	}

	private List<File> findFixtureFolders() {
		File parent = new File(getClass().getResource("/roo/nw/autotest/data/fixtures").getPath());
		File[] children = parent.listFiles();
		if (null == children || children.length < 1) {
			return null;
		}
		List<File> fixtureFolders = Arrays.asList(children).stream().filter(file -> file.isDirectory())
				.collect(Collectors.toList());
		fixtureFolders.sort(comparing(File::getName));
		return fixtureFolders;
	}
}
