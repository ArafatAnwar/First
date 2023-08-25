package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class USPS_HelpPOM {

	WebDriver driver;
	
	public  USPS_HelpPOM (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	     }
	
	@FindBy(xpath="//*[@id=\"g-navigation\"]/div/nav/ul/li[7]/a[2]")
	WebElement Mouse_Hover;
	public WebElement Help() {
		return Mouse_Hover;
	}
	
	@FindBy(xpath="//*[@id=\"g-navigation\"]/div/nav/ul/li[7]/div/ul/li[1]/a")
	WebElement Click_Faqs;
	public WebElement FAQs() {
		return Click_Faqs;
	}
}
