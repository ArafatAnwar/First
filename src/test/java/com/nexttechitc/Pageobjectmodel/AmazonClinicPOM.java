package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonClinicPOM {

	
	WebDriver driver;
	
	public  AmazonClinicPOM (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	     }
	   

	 
              //Locator=Name
	  ////a[@href=\"/amazon-fashion/b/?ie=UTF8&node=7141123011&ref_=nav_cs_fashion\"]
	   
	   @FindBy(xpath="//a[@href=\"https://clinic.amazon.com/?nodl=0&ref_=nav_cs_clinic\"]")
	   
	   WebElement Click_clinic;
	     
	   public WebElement clinic(){
	   return Click_clinic;

	    }
	 

}

	
	

