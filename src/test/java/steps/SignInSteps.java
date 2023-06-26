package steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignInPage;
import qa.DriverFactory;

public class SignInSteps {
	
	SignInPage sp = new SignInPage(DriverFactory.getDriver());
	
	@Given("user should be on sign in page")
	public void user_should_be_on_sign_in_page() {
	   
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	}

	@When("user click on sign in button")
	public void user_click_on_sign_in_button() {
	   
		sp.clickOnSignInBtn();
	}

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String Uname, String pwd) {
	   
		sp.enterUsername(Uname);
		sp.enterPassword(pwd);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	   
		sp.clickOnLoginBtn();
	}

	@Then("user name should appear at left corner of the page as {string}")
	public void user_name_should_appear_at_left_corner_of_the_page_as(String expectedContent) {
	    
		String contentFromPage	= sp.verifyContent();
		
		if(contentFromPage.contains(expectedContent)) {
			
			Assert.assertTrue(true);
		}else {
			
			Assert.assertTrue(false);
		}
	
	}

}
