package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	WebDriver driver;
	
	public SignInPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//*[contains(text(),'Sign In')]")
	private WebElement btnSignIn;
	
	@FindBy(xpath = "//*[@name='username']")
	private WebElement textUsername;
	
	@FindBy(xpath = "//*[@name='password']")
	private WebElement textPassword;
	
	@FindBy(xpath = "//*[@name='signon']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//*[@id='WelcomeContent']")
	private WebElement content;
	
	
	public void clickOnSignInBtn() {
		
		btnSignIn.click();
	}
	
	public void enterUsername(String Uname) {
		
		textUsername.sendKeys(Uname);
	}
	
	public void enterPassword(String pwd) {
		
		textPassword.clear();
		textPassword.sendKeys(pwd);
	}
	
	public void clickOnLoginBtn() {
		
		btnLogin.click();
	}
	
	public String verifyContent() {
		
		String actualTextFromPage = content.getText();
		
		return actualTextFromPage;
	}
	
	
	
	
	
	
	

}
