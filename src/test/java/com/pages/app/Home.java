package com.pages.app;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.driver.MyDriver;

public class Home extends BasePage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public Home(WebDriver driver) {
		super(driver);
		driver.get("https://www.travelocity.com/");
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,10); 
	}
	
	@FindBy(id="tab-flight-tab-hp")
	private WebElement flightsButton;

	public WebElement flightsButton() {
		return flightsButton;
	}
	
	@FindBy(css="#flight-origin-hp-flight")
	private WebElement flyingFromInput;
	
	public WebElement flyingFromInput() {
		return flyingFromInput;
	}
	
	@FindBy(css="#flight-destination-hp-flight")
	private WebElement flyingToInput;
	
	public WebElement flyingToInput() {
		return flyingToInput;
	}
	
	@FindBy(id="flight-departing-hp-flight")
	private WebElement departingDateSelector;
	
	public WebElement departingDateSelector() {
		return departingDateSelector;
	}
	
	@FindBy(xpath="//button[@class='datepicker-paging datepicker-next btn-paging btn-secondary next']")
	private WebElement nextButtonCalendar;
	
	public WebElement nextButtonCalendar() {
		return nextButtonCalendar;
	}
	
	@FindBy(xpath="//tr[2]/td[6]/button")
	private WebElement departing;
	
	public WebElement departing() {
		return departing;
	}
	
	@FindBy(id="flight-returning-hp-flight")
	private WebElement returningSelector;
	
	public WebElement returningSelector() {
		return returningSelector;
	}
	
	
	@FindBy(xpath="//div[3]//table[1]//tbody[1]//tr[3]//td[2]//button[1]")
	private WebElement returning;
	
	public WebElement returning() {
		return returning;
	}
	
	@FindBy(id="flight-adults-hp-flight")
	private WebElement adultsSelector;
	
	public WebElement adultsSelector() {
		return adultsSelector;
	}
	
	@FindBy(id="flight-children-hp-flight")
	private WebElement childrenSelector;
	
	public WebElement childrenSelector() {
		return childrenSelector;
	}
	
	@FindBy(id="flight-age-select-1-hp-flight")
	private WebElement childOne;
	
	public WebElement childOne() {
		return childOne;
	}
	
	@FindBy(id="flight-age-select-2-hp-flight")
	private WebElement childTwo;
	
	public WebElement childTwo() {
		return childTwo;
	}
	
	@FindBy(xpath="//form[@id='gcw-flights-form-hp-flight']//button[@type='submit']")
	private WebElement submitButton;
	
	@FindBy(xpath="//div[@class='autocomplete-dropdown']")
	private WebElement flyingFromSuggestion;
	
	public WebElement flyingFromSuggestion() {
		return flyingFromSuggestion;
	}
	
	public WebElement submitButton() {
		return submitButton;
	}
	
	// Error messages on Search
	
	@FindBy(xpath="//h5[@class='alert-title no-outline']")
	private WebElement errorText;
	
	public WebElement errorText() {
		return errorText;
	}
	
	@FindBy(xpath="//a[contains(text(),'Tell us where you're flying from.')]")
	private WebElement flyingFromError;
	
	public WebElement flyingFromError() {
		return flyingFromError;
	}
	
	@FindBy(xpath="//a[contains(text(),'Tell us where you're flying to.')]")
	private WebElement flyingToError;
	
	public WebElement flyingToError() {
		return flyingToError;
	}
	
	
	
	}

 