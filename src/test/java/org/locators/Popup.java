package org.locators;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Popup extends BaseClass{
	public Popup() {
PageFactory.initElements(driver, this);	}

	@FindBy(xpath="(//button[@class])[2]")
	private WebElement close;
	
	
	public WebElement getClose() {
		return close;
	}
	
	
}
