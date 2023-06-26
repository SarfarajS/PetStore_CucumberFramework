package steps;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddToCartPage;
import qa.DriverFactory;

public class AddToCartSteps {

	AddToCartPage ap = new AddToCartPage(DriverFactory.getDriver());
			
	@When("user click on product Fish")
	public void user_click_on_product_fish() {
	   ap.clickonFishitem();
	}

	@When("user click on product Id AngelFish")
	public void user_click_on_product_id_angel_fish() {
	    ap.clickonProductID();
	}

	@When("user click on add to cart button")
	public void user_click_on_add_to_cart_button() {
	    ap.clickonaddToCart();
		
	}

	@When("user click on proceed to checkout")
	public void user_click_on_proceed_to_checkout() {
	    ap.clickonProceedTocheckout();
	}

	@When("user click on continue button")
	public void user_click_on_continue_button() {
	    ap.clickOnContinue();
	}

	@When("user click on confirm button")
	public void user_click_on_confirm_button() {
	    ap.clickonConfirm();
	}

	@Then("user should able to see the message as {string}")
	public void user_should_able_to_see_the_message_as(String expectedvalue) {
	    
		String actualText = ap.verifyText();
		
		if(actualText.contains(expectedvalue)) {
			
			Assert.assertTrue(true);
		}
		else {
			
			Assert.assertTrue(false);
		}
		
	}


}
