package hooks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.DriverFactory;

public class AppHooks {

	WebDriver driver;
	DriverFactory df;
	
	@Before
	public void launchBrowser() throws IOException {
		
		Properties pro = new Properties();
		
		//String path = ".\\Config.properties";
		
		String path = System.getProperty("user.dir")+"\\Config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		pro.load(fis);
		
		String browsername = pro.getProperty("browser");
		
		df = new DriverFactory();
		
		driver = df.initBrowser(browsername);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
