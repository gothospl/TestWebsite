package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogInTest {
	
	private LogInTest() {
		throw new IllegalStateException("Utility Class");
	}
	
	static void test(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement loginButton = driver.findElement(By.cssSelector("ul.marketing-nav__items:nth-child(4) > li:nth-child(3) > form:nth-child(1) > input:nth-child(1)"));
		loginButton.click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("inputEmail"))));
		
		WebElement usernameBox = driver.findElement(By.cssSelector("#inputEmail"));
		WebElement passwordBox = driver.findElement(By.cssSelector("#inputPassword"));
		WebElement captchaBox = driver.findElement(By.cssSelector(".recaptcha-checkbox-border"));
		WebElement loginButton2 = driver.findElement(By.cssSelector("#login"));
		
		usernameBox.sendKeys("user@phptravels.com");
		passwordBox.sendKeys("demouser");
		captchaBox.click();
		loginButton2.click();
		
	}

}
