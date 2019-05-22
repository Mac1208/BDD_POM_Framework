package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(
		
		features = "C:\\Users\\roys19\\Documents\\SeleniumPractice\\FreeCRMBDDWithPageObjectModel\\src\\main\\java\\com\\qa\\feature\\Login.feature",
		glue = {"com\\qa\\loginStepDefinition"},
		dryRun = false,
		strict = true,
		monochrome = true	
		)

public class LoginTestRunner {

}
