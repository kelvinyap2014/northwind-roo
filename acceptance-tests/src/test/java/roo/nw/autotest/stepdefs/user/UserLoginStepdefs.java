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

package roo.nw.autotest.stepdefs.user;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import roo.nw.autotest.common.TestDataUtil;
import roo.nw.autotest.common.WebDriverUtil;
import roo.nw.autotest.util.user.UserLoginUtil;

public class UserLoginStepdefs {

	private UserLoginUtil userUtil;
	private String userId;

	public UserLoginStepdefs() {
		WebDriver driver = WebDriverUtil.getWebDriver();
		this.userUtil = new UserLoginUtil(driver);
	}

	@Given("^the user with login id (.*)$")
	public void the_user_with_login_id(final String userId) {
		this.userId = userId;
		assertThat(userId).isNotEmpty();
	}

	@Then("^the user can log in without problem$")
	public void the_user_can_log_in_without_problem() {
		assertUserLogin(userId);
	}

	@Given("^a user has already login$")
	public void a_user_has_already_login() {
		if (!userUtil.isUserAlreadyLogin()) {
			assertUserLogin("user");
		}
	}

	@Then("^the user can logout$")
	public void the_user_can_logout() {
		boolean logoutStatus = userUtil.logout();
		assertThat(logoutStatus).isTrue();
	}

	private void assertUserLogin(final String userId) {
		// FIXME: find password, from test data loading
		String password = TestDataUtil.getProperty(String.format("pass.%s", userId));
		boolean loginStatus = userUtil.login(userId, password);
		assertThat(loginStatus).isTrue();
	}
}
