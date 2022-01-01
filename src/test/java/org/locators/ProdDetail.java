package org.locators;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdDetail extends BaseClass {
public ProdDetail() {
PageFactory.initElements(driver, this);}

@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement pincode;

@FindBy(xpath="(//span[text()='Check'])")
private WebElement check;

@FindBy(xpath="//button[text()='ADD TO CART']")
private WebElement addtocart;

public WebElement getPincode() {
	return pincode;
}

public WebElement getCheck() {
	return check;
}

public WebElement getAddtocart() {
	return addtocart;
}
}