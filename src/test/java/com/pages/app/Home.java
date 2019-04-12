package com.pages.app;

import java.time.Duration;

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
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,10); 
	}
	
	@FindBy(id="ctl00_HyperLinkLogin")
	private WebElement hyperlinkLogin;

	@FindBy(xpath="//a[contains(text(),'SpiceClub Members')]")
	private WebElement spiceclubmembersLink;
	
	@FindBy(xpath="//a[contains(text(),'Sign up')]")
	private WebElement signupLink;
	
	@FindBy(id="highlight-addons")
	private WebElement addonsLink;
	
	@FindBy(xpath="//a[contains(text(),'Sign up')]")
	private WebElement memberLogin;
	
	//-----------------Search Flights ---------------------
	@FindBy(id="ctl00_mainContent_ddl_originStation1_CTXT")
	private WebElement departureCity;
	
	@FindBy(id="ctl00_mainContent_ddl_destinationStation1_CTXT")
	private WebElement arrivalCity;
	
	@FindBy(id="ctl00_mainContent_view_date1")
	private WebElement departDate;
	
	@FindBy(id="divpaxinfo")
	private WebElement passengers;
	
	@FindBy(xpath="//a[@value='BKK']")
	private WebElement suggestedBangkok;
	
	@FindBy(xpath="//a[@value='DXB']")
	private WebElement suggestedDubai;
	
	public WebElement departureCity() {
		return departureCity;
	}
	
	public WebElement arrivalCity() {
		return arrivalCity;
	}
	
	public WebElement suggestedBangkok() {
		return suggestedBangkok;
	}
	
	public WebElement suggestedDubai() {
		return suggestedDubai;
	}
	
	public WebElement departDate() {
		return departDate;
	}
	
	
	
	
	
	
	
	
	//--------------End of Search Flights ---------------
	
	
	public WebDriverWait getWait() {
		return wait;	
	}
	
	public RegisterPage accessSignupPage() {	
		Actions a = new Actions(getDriver());
		a.moveToElement(hyperlinkLogin).pause(Duration.ofSeconds(2)).moveToElement(spiceclubmembersLink).pause(Duration.ofSeconds(2)).click(memberLogin).build().perform();
		return new RegisterPage(getDriver());
	}
	
	public WebElement getLoginLocator() {
		return hyperlinkLogin;
	}

}
