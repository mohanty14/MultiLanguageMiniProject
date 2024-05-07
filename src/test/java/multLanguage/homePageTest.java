package multLanguage;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.configLanguage;
import driver.driverFactory;
import pages.HomePage;

public class homePageTest {
	driverFactory df;
	configLanguage cp;
	Properties prop;
	WebDriver driver;
	HomePage homePage;

	@BeforeTest
	public void setup() {
		cp = new configLanguage();
		prop = cp.readProperty();
		df = new driverFactory();
		driver = df.initDriver("chrome", prop);
		homePage = new HomePage(driver);
	}

	
	
	@Test
	public void heaerTestValidation() {
		Assert.assertTrue(homePage.isHeaderExist(prop.getProperty("header")));
		
		System.out.println("hellorhru");
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
	
	
	

}
