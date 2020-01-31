package automationFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstTestCase {

	public static void main(String[] args) {
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dziub\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://phptravels.com/demo/");
		
		LogInTest.test(driver);
		
		driver.quit();
	}

}
