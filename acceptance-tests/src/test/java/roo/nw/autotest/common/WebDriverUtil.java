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

import java.io.File;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import ru.stqa.selenium.factory.WebDriverPool;

public class WebDriverUtil {
	public static WebDriver getWebDriver() {
		WebDriver driver = WebDriverPool.DEFAULT.getDriver(findBrowserCapabilities());
		// destroy the instance (calls driver.quit() implicitly)
		// WebDriverPool.DEFAULT.dismissDriver(driver);
		return driver;
	}
	
	private static Capabilities findBrowserCapabilities() {
		ensureWebDriverPath();
		return DesiredCapabilities.firefox();
	}
	
	private static void ensureWebDriverPath() {
		// firefox need -Dwebdriver.gecko.driver=/path/to/geckodriver
		if(StringUtils.isBlank(System.getProperty("webdriver.gecko.driver"))) {
			loadWebDriver();
		}
	}
	
	private static void loadWebDriver() {
		String driverPath = "";
		File firefoxDir = new File(findWebDriverFolder(), "firefox");
		String os = System.getProperty("os.name").toLowerCase();
		if (os.indexOf("mac") >= 0) {
			// MacOS
			driverPath = new File(firefoxDir, "geckodriver-v0.16.1-macos").getAbsolutePath();
		} else if (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0 || os.indexOf("aix") > 0 ) {
			// Linux or Unix
			driverPath = new File(firefoxDir, "geckodriver-v0.16.1-linux64").getAbsolutePath();
		} else if (os.indexOf("win") >= 0) {
			// Windows
			driverPath = new File(firefoxDir, "geckodriver-v0.16.1-win64.exe").getAbsolutePath();
		}
		System.setProperty("webdriver.gecko.driver", driverPath);
	}
	
	private static File findWebDriverFolder() {
		String rooNwDir = Thread.currentThread().getContextClassLoader().getResource("roo/nw").getFile();
		File acceptanceTestDir = new File(rooNwDir).getParentFile().getParentFile().getParentFile().getParentFile();
		return new File(acceptanceTestDir, "web_driver");
		
	}
}
