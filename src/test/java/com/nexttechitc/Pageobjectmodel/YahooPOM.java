package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YahooPOM {

	WebDriver driver;
	

    //Constraction_Name
	public  YahooPOM (WebDriver driver) {
     this.driver=driver;
     PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"login-username\"]")
	WebElement Type_email;
	public WebElement EmailID() {
		return Type_email;
	}
	@FindBy(xpath="//*[@id=\"login-signin\"]") 
	WebElement Click_Next;
	public WebElement IDNext() {
		return Click_Next;
	}
	@FindBy (xpath="//*[@id=\"login-passwd\"]")
	WebElement Type_PW;
	public WebElement Password() {
		return Type_PW;
	}
	@FindBy (xpath="//*[@id=\"login-signin\"]")
	WebElement Click_Next1;
	public WebElement PWNext(){
		return Click_Next1; 
	}
}
