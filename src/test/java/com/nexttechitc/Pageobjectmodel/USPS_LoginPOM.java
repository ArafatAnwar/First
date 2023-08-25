package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class USPS_LoginPOM {

WebDriver driver;
	

	
    //Constraction_Name
	public  USPS_LoginPOM (WebDriver driver) {
     this.driver=driver;
     PageFactory.initElements(driver, this);
	} 

	@FindBy(xpath="//*[@id=\"login-register-header\"]")
	WebElement Click_Sign;
	public WebElement Sign() {
		return Click_Sign;
	}
	
	@FindBy(xpath="//*[@id=\"username\"]")
	WebElement Type_username;
	public WebElement username() {
		return Type_username;
	}
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement Type_pw;
	public WebElement pw() {
		return Type_pw;
	}
	@FindBy(xpath="//*[@id=\"btn-submit\"]")
	WebElement Click_Sign1;
	public WebElement signicon() {
		return Click_Sign1;
	}
}
