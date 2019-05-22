package com.qa.loginStepDefinition;

import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;
import com.qa.TestBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition extends TestBase {
	
	LoginPage loginPage = new LoginPage();
		
	@Given("^The User is already on Login Page$")
	public void user_already_on_login_page(){
		TestBase.initialization();
		
	}
	
	@When("^The Login Page is displayed$")
	public void login_page_displayed() throws Exception{
		String loginPageTitle = loginPage.getLoginPageTitle();
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", loginPageTitle);
		Thread.sleep(3000);
	}
	
	@Then("^The User enters the valid credentials$")
	public void user_enters_valid_credentials(){
		System.out.println(prop.getProperty("Username"));
		System.out.println(prop.getProperty("Password"));
		loginPage.validLogin();
		
	}
	
	
	}
