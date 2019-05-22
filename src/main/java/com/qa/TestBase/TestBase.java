package com.qa.TestBase;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static Properties prop;
	public static FileInputStream inp;
	public static WebDriver driver;
	
	public TestBase(){
		
		try{
			prop = new Properties();
			inp = new FileInputStream("C:\\Users\\roys19\\Documents\\SeleniumPractice\\FreeCRMBDDWithPageObjectModel\\src\\main\\java\\com\\qa\\Config\\config.properties");
			prop.load(inp);
		}catch(Exception e){
			e.getMessage();
		}
	}
	
	public static void initialization(){
		
		try{
			String browserName = prop.getProperty("browser");
			
			if(browserName.equals("chrome")){
				System.getProperty("WebDriver.chrome.driver", "./Driver/chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browserName.equals("ff")){
				System.getProperty("WebDriver.gecko.driver", "./Driver/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			Thread.sleep(3000);
			
		}catch(Exception e){
			e.getMessage();
		}
		
		
		
	}
	

}
