package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.USPS_BuyPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class USPS_Buy {

	WebDriver driver;
	

		@Given("^User visit USPS page$")
		public void user_visit_USPS_page() throws Throwable {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			    driver = new ChromeDriver();
			   
			    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			 // how to open URL
			    driver.get("https://www.usps.com");
			       Thread.sleep(3000);
			       driver.manage().window().maximize();
}

		@When("^User click on Stamps & Supplies, click on Desire stamps and click on Add to cart and click Check Out Now$")
		public void user_click_on_Stamps_Supplies_click_on_Desire_stamps_and_click_on_Add_to_cart_and_click_Check_Out_Now() throws Throwable {
			USPS_BuyPOM click=new USPS_BuyPOM(driver);
			click.Stamps_Supplies().click();
			click.Click_Stamps().click();
			click.Add_Cart().click();
			//Thread.sleep(4000);
			WebDriverWait wait=new WebDriverWait(driver,20);
			 
			
			click.Checkout().click();
			
}

		@When("^User click heck Out as Guest$")
		public void user_click_heck_Out_as_Guest() throws Throwable {
			USPS_BuyPOM Guest=new USPS_BuyPOM(driver);
			Guest.Check_out_guest().click();
			WebDriverWait wait=new WebDriverWait(driver,20);
}

		@When("^User insert \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
		public void user_insert(String arg1, String arg2, String arg3, String arg4) throws Throwable {
			USPS_BuyPOM Data=new USPS_BuyPOM(driver);
			Data.FirstName().sendKeys(arg1);
			Data.LastName().sendKeys(arg2);
			Data.Phone().sendKeys(arg3);
			Data.Email().sendKeys(arg4);
			WebDriverWait wait=new WebDriverWait(driver,20);
}

		@When("^User check mark same as above box$")
		public void user_check_mark_same_as_above_box() throws Throwable {
			USPS_BuyPOM Box=new USPS_BuyPOM(driver);
			Box.click_Box().click();
			WebDriverWait wait=new WebDriverWait(driver,20);
}

		@When("^User insert \"([^\"]*)\", \"([^\"]*)\", Select state from dropdown and \"([^\"]*)\"$")
		public void user_insert_Select_state_from_dropdown_and(String arg1, String arg2, String arg3) throws Throwable {
			USPS_BuyPOM Add=new USPS_BuyPOM(driver);
			Add.Address().sendKeys(arg1);
			Add.City().sendKeys(arg2);
			Select State=new Select(Add.State());
			State.selectByVisibleText("TX - Texas");
			Add.Zip().sendKeys(arg3);
			WebDriverWait wait=new WebDriverWait(driver,20);
			
}	

		@When("^User click Check Out Now$")
		public void user_click_Check_Out_Now() throws Throwable {
			USPS_BuyPOM Check=new USPS_BuyPOM(driver);
			Check.CHKOUT2().click();
			WebDriverWait wait=new WebDriverWait(driver,20); 
			
}

		@Then("^User should be able to check out$")
		public void user_should_be_able_to_check_out() throws Throwable {
			driver.close();   
}

	
	
}
