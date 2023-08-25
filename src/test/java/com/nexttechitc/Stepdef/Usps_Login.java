package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.USPS_LoginPOM;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Usps_Login {

	
	WebDriver driver;
	
	
	
	
	@Given("^user visit USPS home page$")
	public void user_visit_USPS_home_page() throws Throwable {
		//how to open browser?
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		   
		    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 // how to open URL
		driver.get("https://www.usps.com/");
		WebDriverWait wait=new WebDriverWait(driver,20);
		       driver.manage().window().maximize();
	}

	@When("^user click on signin$")
	public void user_click_on_signin() throws Throwable {
		USPS_LoginPOM log=new USPS_LoginPOM(driver);
	
		log.Sign().click();
		WebDriverWait wait=new WebDriverWait(driver,20);
	
	    
	}

	@When("^user insert valid \"([^\"]*)\" and  valid \"([^\"]*)\" and click next$")
	public void user_insert_valid_and_valid_and_click_next(String arg1, String arg2) throws Throwable {
		USPS_LoginPOM log=new USPS_LoginPOM(driver);
	   log.username().sendKeys(arg1);
	   log.pw().sendKeys(arg2);
	   log.signicon().click();
		WebDriverWait wait=new WebDriverWait(driver,20);
	}

	@Then("^user should be log in$")
	public void user_should_be_log_in() throws Throwable {
		//driver.close();   
	}


	
}
