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

package roo.nw.autotest.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

import roo.nw.autotest.common.ConfigUtil;

public abstract class AbstractSeleniumUtil {
	private WebDriver driver;

	public AbstractSeleniumUtil(WebDriver driver) {
		this.driver = driver;
		this.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	protected WebDriver getDriver() {
		return driver;
	}

	protected void navigateToRootPage() {
		getDriver().navigate().to(ConfigUtil.getAppUrl());
	}

	protected WebElement findElement(final By by1) {
		return new FluentWait<>(by1).until(new Function<By, WebElement>() {
			@Override
			public WebElement apply(final By by2) {
				return AbstractSeleniumUtil.this.driver.findElement(by2);
			}
		});
	}

	protected List<WebElement> findElements(final By by1) {
		return new FluentWait<>(by1).until(new Function<By, List<WebElement>>() {
			@Override
			public List<WebElement> apply(final By by2) {
				return AbstractSeleniumUtil.this.driver.findElements(by2);
			}
		});
	}

	protected WebElement waitUntilVisibilityOfElement(final By by) {
		return new FluentWait<>(this.driver).until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	protected List<WebElement> waitUntilVisibilityOfAllElements(final By by) {
		return new FluentWait<>(this.driver).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
	}

	protected Boolean waitUntilInvisibilityOfElement(final By by) {
		return new FluentWait<>(this.driver).until(ExpectedConditions.invisibilityOfElementLocated(by));
	}

	protected WebElement waitUntilElementToBeClickable(final By by) {
		return new FluentWait<>(this.driver).until(ExpectedConditions.elementToBeClickable(by));
	}
}
