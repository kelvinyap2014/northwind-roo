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

package roo.nw.autotest.util.user;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import roo.nw.autotest.base.AbstractSeleniumUtil;

public class UserLoginUtil extends AbstractSeleniumUtil {
	public UserLoginUtil(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * Login to the application.
	 */
	public boolean login(final String username, final String password) {
		navigateToRootPage();
		if(!isLoginFormPresent()) {
			return false;
		}
		loginAndSubmit(username, password); 
		return isLogoutFormPresent();
	}
	
	/**
	 * Check if a user has already login.
	 */
	public boolean isUserAlreadyLogin() {
		navigateToRootPage();
		return isLogoutFormPresent();
	}

	/**
	 * Logout to the application.
	 */
	public boolean logout() {
		navigateToRootPage();
		if(!isLogoutFormPresent()) {
			return false;
		}
		findLogoutFormElement().submit();
		return isLoginFormPresent();
	}
	
	private void loginAndSubmit(final String username, final String password) {
		WebElement userElement = findElement(By.name("username"));
		WebElement passwordElement = findElement(By.name("password"));
		WebElement acceptElement = findElement(By.className("btn-primary"));
		userElement.sendKeys(username);
		passwordElement.sendKeys(password);
		acceptElement.submit();
	}

	private boolean isLoginFormPresent() {
		WebElement loginFormElement = null;
		try {
			loginFormElement = findLoginFormElement();
		} catch (NoSuchElementException e) {
			return false;
		}
		if(null != loginFormElement) {
			return true;
		}
		return false;
	}

	private WebElement findLoginFormElement() {
		WebElement loginFormElement = findElement(By.xpath("//form[@action='/login']"));
		return loginFormElement;
	}

	private boolean isLogoutFormPresent() {
		WebElement logoutFormElement = null;
		try {
			logoutFormElement = findLogoutFormElement();
		} catch (NoSuchElementException e) {
			return false;
		}
		if(null != logoutFormElement) {
			return true;
		}
		return false;
	}

	private WebElement findLogoutFormElement() {
		WebElement logoutFormElement = findElement(By.xpath("//form[@action='/logout']"));
		return logoutFormElement;
	}
}
