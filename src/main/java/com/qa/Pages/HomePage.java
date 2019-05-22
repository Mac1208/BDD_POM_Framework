package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class HomePage extends TestBase {
	
	// Object Repository for HomePage
	
	@FindBy(xpath = "//td[contains(text(),'User: Samik Roy')]")
	WebElement LoggedInUserLabel;
	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageTitle(){
		return driver.getTitle();
	}
	
	

}
