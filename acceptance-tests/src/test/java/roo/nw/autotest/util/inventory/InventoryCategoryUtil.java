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

package roo.nw.autotest.util.inventory;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import roo.nw.autotest.base.AbstractSeleniumUtil;

public class InventoryCategoryUtil extends AbstractSeleniumUtil {
	public InventoryCategoryUtil(WebDriver driver) {
		super(driver);
	}

	public boolean addCategory(String name, String desc) {
		navigateToRootPage();
		WebElement category = findElement(By.xpath("//*[@id='category-entry']/a"));
		category.click();
		WebElement createCategory = findElement(By.xpath("//*[@id='category-entry']/ul/li[1]/a"));
		createCategory.click();
		if(!isCategoryFormPresent()) {
			return false;
		}
		addCategoryAndSubmit(name, desc);
		
		return isCategoryCardPresent();
	}
	
	public boolean isCategoryAdded(String name, String desc) {
		if(!isCategoryCardPresent()) {
			return false;
		}
		WebElement categoryName = findElement(By.xpath("//*[@id='category-name-field']/span"));
		WebElement categoryDesc = findElement(By.xpath("//*[@id='category-description-field']/span"));
		if(name.equals(categoryName.getText().trim()) && desc.equals(categoryDesc.getText().trim())) {
			return true;
		}
		
		return false;
	}

	private boolean isCategoryCardPresent() {
		WebElement title = null;
		try {
			title = findElement(By.xpath("//*[@id='mainEntityFieldSet']/h2"));
		} catch (NoSuchElementException e) {
			title = null;;
		}
		if(null != title && "Category data".equals(title.getText().trim())) {
			return true;
		}
		return false;
	}
	
	private void addCategoryAndSubmit(final String name, final String desc) {
		WebElement nameElement = findElement(By.id("name"));
		WebElement descElement = findElement(By.id("description"));
		WebElement acceptElement = findElement(By.className("btn-primary"));
		nameElement.sendKeys(name);
		descElement.sendKeys(desc);
		acceptElement.submit();
	}

	private boolean isCategoryFormPresent() {
		WebElement categoryFormElement = null;
		try {
			categoryFormElement = findCategoryFormElement();
		} catch (NoSuchElementException e) {
			return false;
		}
		if(null != categoryFormElement) {
			return true;
		}
		return false;
	}

	private WebElement findCategoryFormElement() {
		WebElement categoryFormElement = findElement(By.xpath("//form[@action='/categories/']"));
		return categoryFormElement;
	}
}
