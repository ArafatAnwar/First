package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbaySearchPOM {

	WebDriver driver;
	
	public  EbaySearchPOM (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	     }
	   
	  

	 
              //Locator=Name
	   @FindBy(xpath="//input[@type=\"text\"]")
	   WebElement Type_ebaysearch; //what we need to click/search
	   public WebElement ebaySearch(){ //create a method public webelement methed_name
	   return Type_ebaysearch;
	   
	    
	   }
	   
	   @FindBy(xpath="//input[@type=\"submit\"]")
	   
	   WebElement Click_searchicon;
	     
	   public WebElement searchicon(){
	   return Click_searchicon;

	    }
	 
	
}
