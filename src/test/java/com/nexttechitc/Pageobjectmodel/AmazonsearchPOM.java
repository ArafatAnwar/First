package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonsearchPOM {

	WebDriver driver;
	 //WE HAVE TO CREATE CONSTRUCTOR
	 //CONSTRuctor is not a method but special types of method. 
	 //constructor name and class name will be same
	 //it has no return type
	  
	        //Constraction_Name
	public  AmazonsearchPOM (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	     }
	   
	    //"//input[@id="twotabsearchtextbox"] "

	 
               //Locator=Name
	   @FindBy(name="field-keywords")
	   WebElement Type_amazonsearch; //what we need to click/search
	   public WebElement Amazonsearch(){ //create a method public webelement methed_name
	   return Type_amazonsearch;
	   
	    
	   }
	   
	   @FindBy(id="nav-search-submit-button")
	   
	   WebElement Click_searchicon;
	     
	   public WebElement searchicon(){
	   return Click_searchicon;

	    }
	 

}
