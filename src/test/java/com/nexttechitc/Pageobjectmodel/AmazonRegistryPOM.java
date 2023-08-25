package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonRegistryPOM {
 
	WebDriver driver;
	
	public  AmazonRegistryPOM (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	     
	     }
	   
	
             //Locator=Name
	  ////a[@href=\"/amazon-fashion/b/?ie=UTF8&node=7141123011&ref_=nav_cs_fashion\"]
	   
	  // @FindBy(xpath="//*[@id=\"nav-xshop\"]/a[11]")
	   
	
	@FindBy (id="nav_cs_registry")
	 //*[@id="nav-xshop"]/a[11]
	   WebElement Click_registry;
	     
	   public WebElement registry(){
	   return Click_registry;

	    }
	 

}

	
	



