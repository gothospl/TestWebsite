package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PHPTravelsMain {
	
	public static final FirefoxOptions options = new FirefoxOptions(); 
	SoftAssert sa = new SoftAssert();
	
	
	@BeforeSuite
	public void beforeSuite() throws InterruptedException {
	options.setCapability("marionette", true);
	options.addPreference("browser.link.open_newwindow", 1);
	

	}
		
	@Parameters ({ "username", "password", "address", "expectedMessage"})
	@Test
	public void Login(String username, String password, String address, String expectedMessage) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver(options);			
		LogInTest.test(driver, username, password, address, expectedMessage);
		String bodyText = driver.findElement(By.tagName("body")).getText();
		sa.assertTrue(bodyText.contains(expectedMessage), "Login successful!");
		
		driver.quit();
			
	}
		
}
