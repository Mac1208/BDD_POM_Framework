package com.qa.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class LoginPage extends TestBase {
	
	// Object Repository for Login Page
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement Username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement LoginBtn;
	
	@FindBy(xpath = "//img[@class='img-responsive']")
	WebElement CRMLogo;
	
	// Class Constructor for initialization of Login Page Objects
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String getLoginPageTitle(){
		return (driver.getTitle());
	}
	
	public boolean validateCRMLogo(){
		return CRMLogo.isDisplayed();
	}
	
	public void validLogin(){
		Username.sendKeys("MacTest");
		Password.sendKeys("MacTest123");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", LoginBtn);
		
	}

}
