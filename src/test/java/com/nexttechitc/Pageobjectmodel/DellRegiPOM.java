package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellRegiPOM {
	
	WebDriver driver;
	
	public  DellRegiPOM (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	     }
	
	@FindBy(xpath="//*[@id=\"um-si-label\"]")
	WebElement Hover_SignIn;
	public WebElement Signin() {
		return Hover_SignIn;
	}

	@FindBy(xpath="//*[@id=\"unified-masthead\"]/div[1]/div[2]/div[1]/div/div[2]/div/div[3]/div[2]/a[2]")
	WebElement Click_CreateAcc;
	public WebElement CreateAccount() {
		return Click_CreateAcc;
	}
	
	@FindBy (xpath="//*[@id=\"FirstName\"]")
	WebElement Type_fn;
	public WebElement Firstname() {
		return Type_fn;
	}
	
	
	@FindBy (xpath="//*[@id=\"LastName\"]")
	WebElement Type_ln;
	public WebElement Lastname() {
		return Type_ln;

	}
	
	@FindBy(xpath="//*[@id=\"EmailAddress\"]")
	WebElement Type_email;
	public WebElement email() {
		return Type_email;
	}
	@FindBy (xpath="//*[@id=\"userPwd_UserInputSecret\"]")
	WebElement Type_pw;
	public WebElement password() {
		return Type_pw;
	}
	
	@FindBy (xpath="//*[@id=\"btnCreateAccount\"]")
	WebElement Click_Create;
	public WebElement create() {
		return Click_Create;
	}
}

