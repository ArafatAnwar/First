package com.nexttechitc.Stepdef;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.nexttechitc.Pageobjectmodel.AmazonRegistryPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonRegistry {
	
	WebDriver driver;
	
	@Given("^user visits Amazon pa$")
	public void user_visits_Amazon_pa() throws Throwable {
		//how to open browser?
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		   
		// ChromeOptions options= new ChromeOptions();
		// options.addArguments("start-maximum");
		 
	WebDriver driver = new ChromeDriver();
		
		 //driver = WebDriver.Chrome();
		   
		    
		 // how to open URL
		driver.get("https://www.amazon.com/");
		
		
		//ChromeOptions options = new ChromeOptions(); 
		//options.addArguments("--start-maximized"); 
		//driver = new ChromeDriver(); 
		   
		
		
		
		
		driver.manage().window().maximize();
		      // Thread.sleep(5000);
	}

	@When("^user clicks on Registry icon$")
	public void user_clicks_on_Registry_icon() throws Throwable {
		AmazonRegistryPOM reg=new AmazonRegistryPOM(driver);
		//Thread.sleep(4000);
		reg.registry().submit();
	}

      @Then("^user should be able to redirect to the Registry$")
    	public void user_should_be_able_to_redirect_to_the_Registry() throws Throwable {
	    
	}



}
