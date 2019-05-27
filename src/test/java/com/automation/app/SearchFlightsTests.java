package com.automation.app;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.driver.MyDriver;
import com.pages.app.Home;
import org.apache.commons.io.*;;

public class SearchFlightsTests extends BaseTest {
	
	
	@Test
	public void requiredFieldsValidationOnFlightSearch() {
		
		Home home = new Home(myDriver.getDriver());
		home.flightsButton().click();
		home.submitButton().click();
		System.out.println(home.flyingFromError().getText());
		System.out.println(home.flyingToError().getText());
		Assert.assertEquals(home.errorText().getText(), "Please correct the errors below.");
		Assert.assertEquals(home.flyingFromError().getText(), "Tell us where you're flying from.");
		Assert.assertEquals(home.flyingToError().getText(), "Tell us where you're flying to.");
		myDriver.getDriver().close();
	}
	
	
	@Test
	public void searchFlight() throws InterruptedException, IOException {
		
		Home home = new Home(myDriver.getDriver());
		WebDriverWait wait = new WebDriverWait(myDriver.getDriver(), 10);
		
		home.flightsButton().click();
		home.flyingFromInput().click();
		home.flyingFromInput().sendKeys("Buenos Aires");
		wait.until(ExpectedConditions.elementToBeClickable(home.flyingFromSuggestion()));
		home.flyingFromInput().sendKeys(Keys.DOWN);
		home.flyingFromInput().sendKeys(Keys.ENTER);
		home.flyingToInput().click();
		home.flyingToInput().sendKeys("Sicili");
		wait.until(ExpectedConditions.elementToBeClickable(home.flyingToSuggestion()));
		home.flyingToInput().sendKeys(Keys.DOWN);
		home.flyingToInput().sendKeys(Keys.ENTER);
		home.departingDateSelector().click();
		home.nextButtonCalendar().click();
		home.departing().click();
		home.returningSelector().click();
		home.returning().click();
		Select a = new Select(home.adultsSelector());
		a.selectByValue("3");
		Select c = new Select(home.childrenSelector());
		c.selectByValue("2");
		Select c1 = new Select(home.childOne());
		c1.selectByValue("5");
		Select c2 = new Select(home.childTwo());
		c2.selectByValue("17");
		home.submitButton().click();
		File src = ((TakesScreenshot)myDriver.getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\PC\\Desktop\\Selenium screenshots\\screenshot.png"));
		}
	
	@Test
	public void searchOneWayFlightWithPreferredAirline() {
		Home home = new Home(myDriver.getDriver());
		
	}
	
}

