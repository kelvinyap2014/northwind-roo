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

package roo.nw.autotest.stepdefs.inventory;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.commons.lang3.RandomStringUtils;

import cucumber.api.java.en.Then;
import roo.nw.autotest.base.CommonWebDriver;
import roo.nw.autotest.util.inventory.InventoryCategoryUtil;

public class InventoryCategoryStepdefs {

	private InventoryCategoryUtil categoryUtil;

	public InventoryCategoryStepdefs(CommonWebDriver driver) {
		this.categoryUtil = new InventoryCategoryUtil(driver);
	}

	@Then("^the user can add inventory category$")
	public void the_user_can_add_inventory_category() {
		String name = "Catetory " + RandomStringUtils.randomNumeric(10);
		String desc = "This is the description for " + name;
		boolean addCategory = categoryUtil.addCategory(name, desc);
		assertThat(addCategory).isTrue();
		boolean isCategoryAdded = categoryUtil.isCategoryAdded(name, desc);
		assertThat(isCategoryAdded).isTrue();
	}
}
