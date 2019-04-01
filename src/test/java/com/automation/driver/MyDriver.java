package com.automation.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class MyDriver {
	
	private WebDriver driver;
	
	@Parameters({"browser"})
	
	public MyDriver(String browser)
	{
		switch(browser) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium/chromedriver.exe"); 
			driver = new ChromeDriver();
			 
			break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium/geckodriver.exe");
			 driver = new FirefoxDriver();
			 break;
		case "IE":
			System.setProperty("webdriver.edge.driver", "C:\\Program Files\\Selenium/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		}
	}
	
	public WebDriver getDriver() {
		return this.driver;
		
	}
	

}
