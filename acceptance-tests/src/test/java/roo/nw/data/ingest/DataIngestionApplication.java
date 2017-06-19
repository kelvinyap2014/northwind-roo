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

import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Ingest test data.
 */
public class DataIngestionApplication {
	private static final Log LOG = LogFactory.getLog(DataIngestionApplication.class);

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				DataIngestionConfiguration.class);
		logAllBeans(context);
		
		DataIngestionExecutor executor = context.getBean(DataIngestionExecutor.class);
		executor.run();
	}

	private static void logAllBeans(AnnotationConfigApplicationContext context) {
		StringBuffer msgAllBeans = new StringBuffer("List the beans in application context...\n");
		String[] beanNames = context.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			msgAllBeans.append(beanName);
			msgAllBeans.append("\n");
		}
		LOG.debug(msgAllBeans.toString());
	}
}
