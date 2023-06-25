package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\AppFeature\\Registration.feature"},
		
		glue = {"steps","hooks"},
		
		plugin = {"pretty"},
		
		publish = true,
		
		monochrome = true
		
		)

public class PetStoreRunner extends AbstractTestNGCucumberTests {

}
