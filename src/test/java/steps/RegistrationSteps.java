package steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationPage;
import qa.DriverFactory;

public class RegistrationSteps {
	
	RegistrationPage rp = new RegistrationPage(DriverFactory.getDriver());
	
	@Given("user shold be on home page")
	public void user_shold_be_on_home_page() {
		
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		
	}

	@When("user click on sign button")
	public void user_click_on_sign_button() throws InterruptedException {
		//Thread.sleep(3000);
	    rp.clickSignIn();
	}

	@When("user click on Register Now button")
	public void user_click_on_register_now_button() throws InterruptedException {
		//Thread.sleep(4000);
		rp.clickOnRegisterNowButton();
	}

	@When("user enters User Id as {string}")
	public void user_enters_user_id_as(String UserID) {
		rp.enterUserID(UserID);
	    
	}

	@When("user enters new password as {string}")
	public void user_enters_new_password_as(String pwd) {
	    rp.enterPassword(pwd);
	}

	@When("user enters repeat password as {string}")
	public void user_enters_repeat_password_as(String pwd2) {
	    rp.renterPassword(pwd2);
	}

	@When("user enters First name as {string}")
	public void user_enters_first_name_as(String Fname) {
	    rp.enterFirstname(Fname);
	}

	@When("user enters Last name as {string}")
	public void user_enters_last_name_as(String Lname) {
	    rp.enterLastname(Lname);
	}

	@When("user enters email as {string}")
	public void user_enters_email_as(String email) {
	    rp.enterEmail(email);
	}

	@When("user enters phone as {string}")
	public void user_enters_phone_as(String phone) {
	   rp.enterPhone(phone);
	}

	@When("user enters address1 as {string}")
	public void user_enters_address1_as(String address1) {
	    rp.enterAddress1(address1);
	}

	@When("user enters address2 as {string}")
	public void user_enters_address2_as(String address2) {
	    rp.enterAddress2(address2);
	}

	@When("user enters city as {string}")
	public void user_enters_city_as(String string) {
	   
	}

	@When("user enters state as {string}")
	public void user_enters_state_as(String state) {
	    rp.enterState(state);
	}

	@When("user enters zip as {string}")
	public void user_enters_zip_as(String zip) {
	    rp.enterZip(zip);
	}

	@When("user enters country as {string}")
	public void user_enters_country_as(String country) {
	    rp.enterCountry(country);
	}

	@When("user clicks on Enable MyList checkbox")
	public void user_clicks_on_enable_my_list_checkbox() {
	    rp.clickEnableMyList();
	}

	@When("user clicks on Enable MyBanner checkbox")
	public void user_clicks_on_enable_my_banner_checkbox() {
	   rp.clickEnableMyBanner();
	}

	@When("user clicks on save account information")
	public void user_clicks_on_save_account_information() {
	    rp.clickSaveAccountInformation();
	}

	@Then("user should on home page")
	public void user_should_on_home_page() {
		
		Assert.assertTrue(true);
	}


}
