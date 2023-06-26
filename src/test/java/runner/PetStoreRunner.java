package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		//features = {"src\\test\\resources\\AppFeature\\Registration.feature"},
		
		features = {"src\\test\\resources\\AppFeature\\"},
		
		//features = {"src\\test\\resources\\AppFeature\\AddToCart.feature"},
		
		glue = {"steps","hooks"},
		
		plugin = {"pretty","html:reports/myreport.html"},
		
		publish = true,
		
		monochrome = true
		
		)

public class PetStoreRunner extends AbstractTestNGCucumberTests {

}
