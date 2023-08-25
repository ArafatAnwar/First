package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import com.nexttechitc.Pageobjectmodel.FbRegiPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbRegi {
	
	WebDriver driver;
	
	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
		//how to open browser?
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		   
		    
		 // how to open URL
		    driver.get("https://www.facebook.com/reg/");
		       Thread.sleep(3000);
		       driver.manage().window().maximize();
	}
	

	@When("^user enter \"([^\"]*)\"  \"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		FbRegiPOM type=new FbRegiPOM(driver);
		type.firstname().sendKeys(arg1);
		type.lastname().sendKeys(arg2);
		type.email().sendKeys(arg3);
		type.password().sendKeys(arg4);

	}
	@Then("^user select dropdown Month and dropdown Day and dropdown Year and radio button male$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year_and_radio_button_male() throws Throwable {
		
		FbRegiPOM fbsignup1 =new FbRegiPOM (driver);
		  Select dropdown=new Select (fbsignup1.click_month);
		  dropdown.selectByIndex(2);
		  Thread.sleep(3000);
		  Select dropdown1=new Select (fbsignup1.click_day);
		  dropdown1.selectByValue("2");
		  Thread.sleep(3000);
		  Select dropdown2=new Select (fbsignup1.click_year);
		  dropdown2.selectByVisibleText("2000");
		  Select dropdown3=new Select (fbsignup1.click_male);
		  dropdown3.selectByVisibleText("male");
		  Thread.sleep(3000);
		  //WebDriverWait wait=new WebDriverWait(driver,20);
		  //driver.close();
		  driver.quit();

	}



}
