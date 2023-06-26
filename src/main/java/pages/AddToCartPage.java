package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	WebDriver driver;
	
	public AddToCartPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//img[@src='../images/fish_icon.gif']")
	private WebElement itemFishbtn;
	
	@FindBy(xpath = "//a[text()='FI-SW-01']")
	private WebElement productIDbtn;
	
	@FindBy(xpath = "//*[contains(@href,'addItemToCart=&workingItemId=EST-1')]")
	private WebElement addToCartbtn;
	
	@FindBy(xpath = "//*[text()='Proceed to Checkout']")
	private WebElement proceedToCheckOutbtn;
	
	@FindBy(xpath = "//*[@value='Continue']")
	private WebElement continuebtn;
	
	@FindBy(xpath = "//*[text()='Confirm']")
	private WebElement confirmbtn;
	
	@FindBy(xpath = "//*[contains(text(),'Thank you')]")
	private WebElement validationtext;
	
	
	public void clickonFishitem() {
		
		itemFishbtn.click();
	}
	
	public void clickonProductID() {
		
		productIDbtn.click();
	}
	
	public void clickonaddToCart() {
		
		addToCartbtn.click();
	}
	
	public void clickonProceedTocheckout() {
		
		proceedToCheckOutbtn.click();
	}
	
	public void clickOnContinue() {
		
		continuebtn.click();
	}
	
	public void clickonConfirm() {
		
		confirmbtn.click();
	}
	
	public String verifyText() {
		
		String actualTextFromPage = validationtext.getText();
		System.out.println(actualTextFromPage);
		return actualTextFromPage;
	}
	
	
	
	
	
	
}
