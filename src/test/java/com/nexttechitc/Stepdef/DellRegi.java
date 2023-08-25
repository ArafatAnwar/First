package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DellRegiPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellRegi {

	WebDriver driver;
	
	@Given("^user visit Dell$")
	public void user_visit_Dell() throws Throwable {
		//how to open browser?
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		   
		    
		 // how to open URL
		driver.get("https://www.dell.com/");
		Thread.sleep(3000);
		// Maximize window  
       driver.manage().window().maximize();
		       Thread.sleep(3000);
	}

	@When("^user hover sign in and click Create an account$")
	public void user_hover_sign_in_and_click_Create_an_account() throws Throwable {
	   Actions act=new Actions(driver);
	   DellRegiPOM cre=new DellRegiPOM(driver);
	   act.moveToElement(cre.Signin()).build().perform();
	   Thread.sleep(3000);
	   cre.CreateAccount().click();
	}

	@When("^user type \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and click Create account$")
	public void user_type_and_click_Create_account(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		DellRegiPOM cre=new DellRegiPOM(driver);
		cre.Firstname().sendKeys(arg1);
		cre.Lastname().sendKeys(arg2);
		cre.email().sendKeys(arg3);
		cre.password().sendKeys(arg4);
		cre.create().click();
	}

	@Then("^user should be able to create new account$")
	public void user_should_be_able_to_create_new_account() throws Throwable {
	   
	}


}
