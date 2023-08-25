package com.nexttechitc.Stepdef;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.USPS_HelpPOM;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class USPS_Help {

	WebDriver driver;
	
	@Given("^User visit USPS$")
	public void user_visit_USPS() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	   
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 // how to open URL
	    driver.get("https://www.usps.com");
	    WebDriverWait wait=new WebDriverWait(driver,20);
	       driver.manage().window().maximize();
	 
	}

	@When("^USer mouse hover Help and click FAQs$")
	public void user_mouse_hover_Help_and_click_FAQs() throws Throwable {
	   try {
		   USPS_HelpPOM help= new USPS_HelpPOM(driver);
	   
		Actions act=new Actions(driver);
		
		act.moveToElement(help.Help()).build().perform();
		help.FAQs().click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		
	}
	catch(Exception e) {
		System.out.println("element not found exception");
	}

	}

	@Then("^User should be redirect to FAQs page$")
	public void user_should_be_redirect_to_FAQs_page() throws Throwable {
		driver.close();   
	}


}
