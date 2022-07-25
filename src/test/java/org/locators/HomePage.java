package org.locators;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class HomePage extends BaseClass {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='xtXmba'])[6]")
	private WebElement Home;
	@FindBy(xpath = "(//a[text()='Living Room'])")
	private WebElement livingroom;
	@FindBy(xpath = "(//a[text()='Dining Sets'])")
	private WebElement dining;

	@FindBy(xpath = "(//button[contains(@class,'2Kp')])[1]")
	private WebElement close;

	public WebElement getClose() {
		return close;
	}

	public WebElement getHome() {
		return Home;
	}

	public WebElement getLivingroom() {
		return livingroom;
	}

	public WebElement getDining() {
		return dining;
	}

}
