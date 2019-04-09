package com.automation.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.automation.driver.MyDriver;
import com.pages.app.Home;

public class SignupTests extends BaseTest {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Test
	public void reachSignupPage() throws InterruptedException {
		
		Home home = getHomePage();
		home.accessSignupPage();	
//		Actions a = new Actions(home.getDriver());
//		a.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
//		a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'SpiceClub Members')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		
		
//		Actions a = new Actions(myDriver.getDriver());
//		a.moveToElement(myDriver.getDriver().findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
//		a.moveToElement(myDriver.getDriver().findElement(By.xpath("//a[contains(text(),'SpiceClub Members')]"))).build().perform();
//		myDriver.getDriver().findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
//		Thread.sleep(6000);
		
	}

}
