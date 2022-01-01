package org.locators;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiningProd extends BaseClass {
	public DiningProd() {
PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="s1Q9rs")
	private WebElement prod;

	public WebElement getProd() {
		return prod;
	}
}
