package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.EbaySearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EbaySearch {

	WebDriver driver;
	
	@Given("^user visit Ebay home$")
	public void user_visit_Ebay_home() throws Throwable {
		//how to open browser?
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		   
		    
		 // how to open URL
		driver.get("https://www.ebay.com/");
		       Thread.sleep(3000);
	}

	@When("^user type \"([^\"]*)\" and click search$")
	public void user_type_and_click_search(String arg1) throws Throwable {
		EbaySearchPOM search= new EbaySearchPOM(driver);
		search.ebaySearch().sendKeys(arg1);
		Thread.sleep(3000); 
		search.searchicon().click();
	}

	@Then("^User should able to see the expected phone$")
	public void user_should_able_to_see_the_expected_phone() throws Throwable {
	   
	}


	
}
