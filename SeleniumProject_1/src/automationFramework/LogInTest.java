package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInTest {
	
	private LogInTest() {
		throw new IllegalStateException("Utility Class");
	}
	
	static void test(WebDriver driver) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement frontEndHomepage = driver.findElement(By.cssSelector("div.fadeInUp:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)"));
		frontEndHomepage.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dropdownCurrency\"]")));

		WebElement myAccountButton = driver.findElement(By.cssSelector(".dropdown-login > a:nth-child(1)"));
		myAccountButton.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.tr:nth-child(1)")));
		WebElement goToLoginButton = driver.findElement(By.cssSelector("a.tr:nth-child(1)"));
		goToLoginButton.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.form-group:nth-child(1) > label:nth-child(1) > span:nth-child(2)")));
		
		WebElement usernameBox = driver.findElement(By.cssSelector("div.form-group:nth-child(1) > label:nth-child(1) > input:nth-child(1)"));
		WebElement passwordBox = driver.findElement(By.cssSelector("div.wow:nth-child(3) > div:nth-child(2) > label:nth-child(1) > input:nth-child(1)"));
		WebElement loginButton = driver.findElement(By.cssSelector("button.btn:nth-child(4)"));
		
		usernameBox.sendKeys("user@phptravels.com");
		passwordBox.sendKeys("demouser");
		loginButton.click();
		
	}

}
