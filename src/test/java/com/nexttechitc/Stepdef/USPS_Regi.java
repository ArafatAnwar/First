package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.USPS_RegiPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class USPS_Regi {

	WebDriver driver;
	
	
	@Given("^User visiti USPS home page$")
	public void user_visiti_USPS_home_page() throws Throwable {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
	    driver = new ChromeDriver();
	   
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 // how to open URL
	    driver.get("https://www.usps.com");
	    WebDriverWait wait=new WebDriverWait(driver,20);
	    driver.manage().window().maximize();
	    
	}
	catch (Exception e) {
		System.out.println("webdriver not found exception");
	}
	}

	@When("^User click on register$")
	
		public void user_click_on_register() throws Throwable {
		
	try{
		USPS_RegiPOM click= new USPS_RegiPOM(driver);
		click.Register().click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		
	}
	catch (Exception e) {
		System.out.println("Regi element not found exception");
	}
	}

	@When("^User click on Sign up Now$")
	public void user_click_on_Sign_up_Now() throws Throwable {
		try {
		USPS_RegiPOM signup= new USPS_RegiPOM(driver);
		signup.Signup().click();
		WebDriverWait wait=new WebDriverWait(driver,20);
	}
		catch (Exception e) {
			System.out.println("SignUp Element not found exception");
		}
		}

	@When("^User Choose language$")
	public void user_Choose_language() throws Throwable {
		try {
		USPS_RegiPOM lang=new USPS_RegiPOM(driver);
		
		Select dropdown=new Select (lang.Click_English);
		  dropdown.selectByVisibleText("English");
		  WebDriverWait wait=new WebDriverWait(driver,20);
	}
		catch(Exception e) {
			System.out.println("Language Element not found exception");
		}
		}

	@When("^User insert valid \"([^\"]*)\" , \"([^\"]*)\" and re-enter \"([^\"]*)\"$")
	public void user_insert_valid_and_re_enter(String arg1, String arg2, String arg3) throws Throwable {
		try {
		USPS_RegiPOM obj=new USPS_RegiPOM (driver);
		obj.USerID().sendKeys(arg1);
		obj.Password().sendKeys(arg2);
		obj.RePW().sendKeys(arg2);
		WebDriverWait wait=new WebDriverWait(driver,20);
	}
		catch (Exception e) {
			System.out.println("UI/PW Element not found exception");
		}
		}

	@When("^User select dropdown first security qus and select second security qus$")
	public void user_select_dropdown_first_security_qus_and_select_second_security_qus() throws Throwable {
		try {
		USPS_RegiPOM qus=new USPS_RegiPOM(driver);
		Select dropdown2= new Select(qus.Secqus());
		dropdown2.selectByIndex(1);
		Thread.sleep(3000);
		Select dropdown3=new Select(qus.SESqus());
		dropdown3.selectByIndex(1);
		WebDriverWait wait=new WebDriverWait(driver,20);
	}
		catch(Exception e) {
			System.out.println("Security Qus Element not found exception");
		}
		}
	@When("^User insert first \"([^\"]*)\" and re-enter \"([^\"]*)\",insert second \"([^\"]*)\" and re-enter \"([^\"]*)\"$")
	public void user_insert_first_and_re_enter_insert_second_and_re_enter(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		try {
		USPS_RegiPOM ans=new USPS_RegiPOM(driver);
		ans.FirstAns().sendKeys(arg1);
		ans.REFans().sendKeys(arg2);
		ans.SecondAns().sendKeys(arg3);
		ans.RESecondAns().sendKeys(arg4);
		WebDriverWait wait=new WebDriverWait(driver,20);
	}
		catch(Exception e) {
			System.out.println("Security Ans Element not found exception");
		}
		}

	@When("^User select Radio button Personal account$")
	public void user_select_Radio_button_Personal_account() throws Throwable {
		try {
		USPS_RegiPOM radio=new USPS_RegiPOM(driver);
		radio.Click_Personal.click();
		WebDriverWait wait=new WebDriverWait(driver,20);
	}
		catch(Exception e) {
			System.out.println("Personal Element not found exception");
		}
		}

	@When("^User select dropdown button$")
	public void user_select_dropdown_button() throws Throwable {
		try {
		USPS_RegiPOM title=new USPS_RegiPOM(driver);
		Select dropdown5=new Select (title.Click_Title);
		dropdown5.selectByIndex(1);
		WebDriverWait wait=new WebDriverWait(driver,20);
	}
		catch(Exception e) {
			System.out.println("Dropdown Element not found exception");
		}
		}
	@When("^User insert \"([^\"]*)\", \"([^\"]*)\" ,\"([^\"]*)\", re-enter \"([^\"]*)\"$")
	public void user_insert_re_enter(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		try {
		USPS_RegiPOM name= new USPS_RegiPOM(driver);
		name.FName().sendKeys(arg1);
		name.LName().sendKeys(arg2);
		name.email().sendKeys(arg3);
		name.reemail().sendKeys(arg4);
		WebDriverWait wait=new WebDriverWait(driver,20);
	}
		catch(Exception e) {
			System.out.println("User Info Element not found exception");
		}
		}

	@When("^User select type US$")
	public void user_select_type_US() throws Throwable {
		try {
		USPS_RegiPOM type=new USPS_RegiPOM(driver);
		Select ty=new Select(type.Type_US);
		ty.selectByIndex(0);
		WebDriverWait wait=new WebDriverWait(driver,20);
	}
		catch(Exception e) {
			System.out.println("Type Element not found exception");
		}
		}

	@When("^User insert \"([^\"]*)\"$")
	public void user_insert(String arg1) throws Throwable {
		try {
		USPS_RegiPOM phone=new USPS_RegiPOM(driver);
		phone.Phone().sendKeys(arg1);
		WebDriverWait wait=new WebDriverWait(driver,20);
	}
		catch(Exception e) {
			System.out.println("Ph Element not found exception");
		}
		}
	@When("^User select form dropdown United States$")
	public void user_select_form_dropdown_United_States() throws Throwable {
		try {
		USPS_RegiPOM country=new USPS_RegiPOM(driver);
		Select count=new Select(country.Country);
		count.selectByIndex(0);
		WebDriverWait wait=new WebDriverWait(driver,20);
	}
		catch(Exception e) {
			System.out.println("Country Element not found exception");
		}
		}

	@When("^User insert \"([^\"]*)\", \"([^\"]*)\"$")
	public void user_insert(String arg1, String arg2) throws Throwable {
		try {
		USPS_RegiPOM add=new USPS_RegiPOM(driver);
		add.Address().sendKeys(arg1);
		add.City().sendKeys(arg2);
		WebDriverWait wait=new WebDriverWait(driver,20);
	}
		catch(Exception e) {
			System.out.println("City Element not found exception");
		}
		}

	@When("^User select form dropdown state$")
	public void user_select_form_dropdown_state() throws Throwable {
		try {
		USPS_RegiPOM sta=new USPS_RegiPOM(driver);
		Select state=new Select(sta.State);
		state.selectByVisibleText("TX - Texas");
		WebDriverWait wait=new WebDriverWait(driver,20);
	}
		catch(Exception e) {
			System.out.println("State Element not found exception");
		}
		}

	@When("^User click Verify address$")
	public void user_click_Verify_address() throws Throwable {
		try {
		USPS_RegiPOM veri=new USPS_RegiPOM(driver);
		veri.verify().click();
		WebDriverWait wait=new WebDriverWait(driver,20);
	}
		catch(Exception e) {
			System.out.println("Verify Element not found exception");
		}
		}

	@Then("^User should create a new account$")
	public void user_should_create_a_new_account() throws Throwable {
		driver.close();   
	}
	


	
}
