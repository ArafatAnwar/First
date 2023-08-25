package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.AmazonClinicPOM;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class AmazonClinic {

	WebDriver driver;
	
	//AmazonClinicPOM cli=new AmazonClinicPOM(driver);
	
	@Given("^user visits Amazon page$")
	public void user_visits_Amazon_page() throws Throwable {
		//how to open browser?
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		   
		    
		 // how to open URL
		driver.get("https://www.amazon.com/");
		       Thread.sleep(3000);
	}

	@When("^user clicks on Clinic icon$")
	public void user_clicks_on_Clinic_icon() throws Throwable {
		AmazonClinicPOM cli=new AmazonClinicPOM(driver);
		cli.clinic().click();
	}

	@Then("^user should be able to redirect to the Clinic page$")
	public void user_should_be_able_to_redirect_to_the_Clinic_page() throws Throwable {
	
	
	}


	
}
