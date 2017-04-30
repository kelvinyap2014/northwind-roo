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

package roo.nw.autotest.common;

import java.io.IOException;
import java.util.Properties;

public class TestDataUtil {
	private static final Properties AUTO_TEST_DATA = new Properties();
	
	static {
		try {
			AUTO_TEST_DATA.load(Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("roo/nw/autotest/data/autotest-data.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static final String getProperty(final String property) {
		return AUTO_TEST_DATA.getProperty(property);
	}
}
