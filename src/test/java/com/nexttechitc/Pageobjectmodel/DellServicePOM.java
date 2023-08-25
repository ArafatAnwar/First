package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellServicePOM {

	WebDriver driver;
	
	public  DellServicePOM (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	     }
	


//Locator=Name
		@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/button/span")
		WebElement Action_Service; //what we need to click/search
		public WebElement Service(){ //create a method public webelement methed_name
			return Action_Service;

}
		@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/ul/li[3]/a")
		WebElement Click_ViewAllService; //what we need to click/search
		public WebElement viewAllService(){ //create a method public webelement methed_name
			return Click_ViewAllService;
 
}
}