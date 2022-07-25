package org.stepdefinition;

import org.base.BaseClass;
import org.locators.DiningProd;
import org.locators.HomePage;
import org.locators.Popup;
import org.locators.ProdDetail;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Step extends BaseClass  {
	Popup pp;
	HomePage h=new HomePage();
	Actions b;
	DiningProd d;
	ProdDetail p;
	@Given("User have to launch flipkart home page")
	public void user_have_to_launch_flipkart_home_page() throws InterruptedException {
		
		Chrome();
		LaunchUrl("https://www.flipkart.com/");
		Thread.sleep(3000);
		System.out.println("h"+h);
		h.getClose().click();
		} 

	@When("User have to mouseover to home and to living room")
	public void user_have_to_mouseover_to_home_and_to_living_room() {
	b=new Actions(driver);
	h=new HomePage();
	b.moveToElement(h.getHome()).moveToElement(h.getLivingroom());
	}

	@When("User have  to click dining set from the list")
	public void user_have_to_click_dining_set_from_the_list() {
		b=new Actions(driver);
		h=new HomePage();
		b.moveToElement(h.getDining()).click();
		}

	@When("User have to click the first product")
	public void user_have_to_click_the_first_product() {
		d=new DiningProd();
		d.getProd().click();
	}

	@Then("User have to switch to new tab")
	public void user_have_to_switch_to_new_tab(){
		ChangeWindow();
	}

	@Then("User have to check delivery availablity by entering pincode")
	public void user_have_to_check_delivery_availablity_by_entering_pincode() throws InterruptedException {
	p=new ProdDetail();
	p.getPincode().sendKeys("631501");
	p.getCheck().click();
	Thread.sleep(2000);
	}

	@Then("User have to add the product to the cart")
	public void user_have_to_add_the_product_to_the_cart() {
		p=new ProdDetail();
		p.getAddtocart().click();
	}

}
