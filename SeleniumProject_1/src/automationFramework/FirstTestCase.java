package automationFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("marionette", true);
		options.addPreference("browser.link.open_newwindow", 1);
		System.setProperty("webdriver.gecko.driver", "//home/bartek/Downloads//geckodriver-v0.26.0-linux64//geckodriver");
		WebDriver driver = new FirefoxDriver(options);
		
		driver.navigate().to("https://phptravels.com/demo/");
		
		LogInTest.test(driver);
		
		driver.quit();
	}

}
