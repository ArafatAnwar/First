package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.YahooPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YahooLogin {

	WebDriver driver;
	
	YahooPOM log=new YahooPOM(driver);
	
	@Given("^user visit Yahoo home page$")
	public void user_visit_Yahoo_home_page() throws Throwable {
		//how to open browser?
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		   
		    
		 // how to open URL
		driver.get("https://www.mail.yahoo.com/");
		       Thread.sleep(3000);
	}

	@When("^user insert \"([^\"]*)\" and click next$")
	public void user_insert_and_click_next(String arg1) throws Throwable {
		YahooPOM log=new YahooPOM(driver);
		log.EmailID().sendKeys(arg1);
		log.IDNext().click();
	}

	@Then("^user should redirect to the next$")
	public void user_should_redirect_to_the_next() throws Throwable {
	 
	}

	@When("^user insert valid \"([^\"]*)\" and click next button$")
	public void user_insert_valid_and_click_next_button(String arg2) throws Throwable {
		YahooPOM log=new YahooPOM(driver);
		log.Password().sendKeys(arg2);
	    log.PWNext().click();
	}

	@Then("^user should be login$")
	public void user_should_be_login() throws Throwable {
	    
	}


	
	
	
}
