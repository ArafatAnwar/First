package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class USPS_RegiPOM {

	WebDriver driver;
	
	public  USPS_RegiPOM (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	     }
	
	
	@FindBy(xpath="//*[@id=\"login-register-header\"]")
	WebElement Click_Register;
	public WebElement Register() {
		return Click_Register;
	}
	
	@FindBy(xpath="//*[@id=\"sign-up-button\"]")
	WebElement Click_Signup;
	public WebElement Signup() {
		return Click_Signup;
	}
	
	@FindBy(xpath="//*[@id=\"slanguage\"]")
	public WebElement Click_English;
	
	
	@FindBy(xpath="//*[@id=\"tuserName\"]")
	WebElement Insert_UserID;
	public WebElement USerID() {
		return Insert_UserID;
	}

	@FindBy(xpath="//*[@id=\"tPassword\"]")
	WebElement Insert_pw;
	public WebElement Password() {
		return Insert_pw;
	}
	
	@FindBy(xpath="//*[@id=\"tPasswordRetype\"]")
	WebElement Retype_pw;
	public WebElement RePW() {
		return Retype_pw;
	}
	
	@FindBy(xpath="//*[@id=\"ssec1\"]")
	WebElement Select_Fqus;
	public WebElement Secqus() {
		return Select_Fqus;
	}
	
	@FindBy(xpath="//*[@id=\"tsecAnswer1\"]")
	WebElement Insert_Fans;
	public WebElement FirstAns() {
		return Insert_Fans;
	}
	
	@FindBy(xpath="//*[@id=\"tsecAnswer1Match\"]")
	WebElement Re_FAns;
	public WebElement REFans() {
		return Re_FAns;
	}
	
	@FindBy(xpath="//*[@id=\"ssec2\"]")
	WebElement Second_Squs;
	public WebElement SESqus() {
		return Second_Squs;
	}
	
	@FindBy(xpath="//*[@id=\"tsecAnswer2\"]")
	WebElement Second_Sans;
	public WebElement SecondAns() {
		return Second_Sans;
	}
	
	@FindBy(xpath="//*[@id=\"tsecAnswer2Match\"]")
	WebElement Second_RESans;
	public WebElement RESecondAns() {
		return Second_RESans;
	}
	
	@FindBy(xpath="//*[@id=\"rAccount1\"]")
	public WebElement Click_Personal;
	
	
	@FindBy(xpath="//*[@id=\"stitle\"]")
	public WebElement Click_Title;
	
	@FindBy(xpath="//*[@id=\"tfName\"]")
	WebElement First_Name;
	public WebElement FName() {
		return First_Name;
	}
	
	@FindBy(xpath="//*[@id=\"tlName\"]")
	WebElement Last_Name;
	public WebElement LName() {
		return Last_Name;
	}
	
	@FindBy(xpath="//*[@id=\"temail\"]")
	WebElement Type_email;
	public WebElement email() {
		return Type_email;
	}
	
	@FindBy(xpath="//*[@id=\"temailRetype\"]")
	WebElement Re_email;
	public WebElement reemail() {
		return Re_email;
	}
	
	@FindBy(xpath="//*[@id=\"sphoneType\"]")
	public WebElement Type_US;
	
	@FindBy(xpath="//*[@id=\"tphone\"]")
	WebElement pho;
	public WebElement Phone() {
		return pho;
	}
	
	@FindBy(xpath="//*[@id=\"scountry\"]")
	public WebElement Country;
	
	@FindBy(xpath="//*[@id=\"taddress\"]")
	WebElement add;
	public WebElement Address() {
		return add;
	}
	
	@FindBy(xpath="//*[@id=\"tcity\"]")
	WebElement cit;
	public WebElement City() {
		return cit;
	}
	
	@FindBy(xpath="//*[@id=\"sstate\"]")
	public WebElement State;
	
	@FindBy(xpath="//*[@id=\"a-address-step1\"]")
	WebElement Veri;
	public WebElement verify() {
		return Veri;
	}
}
