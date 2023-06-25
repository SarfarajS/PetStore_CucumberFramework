package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath = "//*[contains(text(),'Sign In')]")
	private WebElement SignIn;
	
	@FindBy(xpath = "//*[contains(text(),'Register Now!')]")
	private WebElement Register;
	
	@FindBy(xpath = "//*[@name='username']")
	private WebElement txtUserID;
	
	@FindBy(xpath = "//*[@name='password']")
	private WebElement txtnewpassword;
	
	@FindBy(xpath = "//*[@name='repeatedPassword']")
	private WebElement repeatpassword;
	
	@FindBy(xpath = "//*[@name='account.firstName']")
	private WebElement firstName;
	
	@FindBy(xpath = "//*[@name='account.lastName']")
	private WebElement LastName;
	
	@FindBy(xpath = "//*[@name='account.email']")
	private WebElement txtemail;
	
	@FindBy(xpath = "//*[@name='account.phone']")
	private WebElement txtphone;
	
	@FindBy(xpath = "//*[@name='account.address1']")
	private WebElement txtaddress1;

	@FindBy(xpath = "//*[@name='account.address2']")
	private WebElement txtaddress2;
	
	@FindBy(xpath = "//*[@name='account.city']")
	private WebElement txtcity;
	
	@FindBy(xpath = "//*[@name='account.state']")
	private WebElement txtstate;
	
	@FindBy(xpath = "//*[@name='account.zip']")
	private WebElement txtzip;
	
	@FindBy(xpath = "//*[@name='account.country']")
	private WebElement txtcountry;
	
	@FindBy(xpath = "//*[@name='account.listOption']")
	private WebElement btnenableMyList;
	
	@FindBy(xpath = "//*[@name='account.bannerOption']")
	private WebElement btnenableMyBanner;
	
	@FindBy(xpath = "//*[@name='newAccount']")
	private WebElement saveAccountInformation;
	
	
	public RegistrationPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	public void clickSignIn() {
		SignIn.click();
	}
	
	public void clickOnRegisterNowButton() {
		
		wait.until(ExpectedConditions.visibilityOf(Register));
		Register.click();
	}
	
	public void enterUserID(String UserID) {
		txtUserID.sendKeys(UserID);
	}
	
	public void enterPassword(String pwd) {
		txtnewpassword.sendKeys(pwd);
	}
	
	public void renterPassword(String pwd2) {
		repeatpassword.sendKeys(pwd2);
	}
	
	public void enterFirstname(String Fname) {
		firstName.sendKeys(Fname);
	}
	
	public void enterLastname(String Lname) {
		LastName.sendKeys(Lname);
	}
	
	public void enterEmail(String email) {
		txtemail.sendKeys(email);
	}
	
	public void enterPhone(String phone) {
		txtphone.sendKeys(phone);
	}
	
	public void enterAddress1(String address1) {
		txtaddress1.sendKeys(address1);
	}
	
	public void enterAddress2(String address2) {
		txtaddress2.sendKeys(address2);
	}
	
	public void enterCity(String city) {
		txtcity.sendKeys(city);
	}
	
	public void enterState(String state) {
		txtstate.sendKeys(state);
	}
	
	public void enterZip(String zip) {
		txtzip.sendKeys(zip);
	}
	
	public void enterCountry(String country) {
		txtcountry.sendKeys(country);
	}
	
	public void clickEnableMyList() {
		btnenableMyList.click();
	}
	
	public void clickEnableMyBanner() {
		btnenableMyBanner.click();
	}
	
	public void clickSaveAccountInformation() {
		saveAccountInformation.click();
	}
	
	
	
	
	
}
