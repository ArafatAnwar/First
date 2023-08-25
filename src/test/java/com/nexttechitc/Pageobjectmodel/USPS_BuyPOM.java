package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class USPS_BuyPOM {

	WebDriver driver;
	
	public  USPS_BuyPOM (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	     }
	
					
	@FindBy(xpath="/html/body/div[7]/div[1]/div/div/div[3]/div/h3[1]/a")
	WebElement Buy_Stamps;
	public WebElement Stamps_Supplies() {
		return Buy_Stamps;
	}
	
	@FindBy(xpath="/html/body/div[3]/div[5]/div/div[2]/div[1]/div/a/div/img")
	WebElement Choose_Stamps;
	public WebElement Click_Stamps() {
		return Choose_Stamps;
	}
	
	@FindBy(xpath="//*[@id=\"addToCartVisBtn122704\"]")
	WebElement Cart;
	public WebElement Add_Cart() {
		return Cart;
	}
					
	@FindBy(xpath="//*[@id=\"atg_button_checkout\"]")
	WebElement Check_Out;
	public WebElement Checkout() {
		return Check_Out;
	}
	@FindBy(xpath="//*[@id=\"btn-guest-checkout-test\"]")
	WebElement Guest;
	public WebElement Check_out_guest() {
		return Guest;
	}
	@FindBy(xpath="//*[@id=\"custFirstName\"]")
	WebElement FN;
	public WebElement FirstName() {
		return FN;
	}
	@FindBy(xpath="//*[@id=\"custLastName\"]")
	WebElement LN;
	public WebElement LastName() {
		return LN;
	}
	@FindBy(xpath="//*[@id=\"custPhone\"]")
	WebElement PH;
	public WebElement Phone() {
		return PH;
	}
	@FindBy(xpath="//*[@id=\"custEmail\"]")
	WebElement EM;
	public WebElement Email() {
		return EM;
	}
	@FindBy(xpath="//*[@id=\"billingInfo\"]/div[5]/div/div[1]/div/label/span")
	WebElement CHKB;
	public WebElement click_Box() {
		return CHKB;
	}
	@FindBy(xpath="//*[@id=\"shipAddress1\"]")
	WebElement Add;
	public WebElement Address() {
		return Add;
	}				
	@FindBy(xpath="//*[@id=\"shipCity\"]")
	WebElement Cit;
	public WebElement City() {
		return Cit;
	}
	@FindBy(xpath="//*[@id=\"shipState\"]")
	WebElement St;
	public WebElement State() {
		return St;
	}
	@FindBy(xpath="//*[@id=\"shipZip\"]")
	WebElement Zi;
	public WebElement Zip() {
		return Zi;
	}
	@FindBy(xpath="//*[@id=\"moveToBillingBtn\"]/span")
	WebElement CHKB2;
	public WebElement CHKOUT2() {
		return CHKB2;
	}
}
