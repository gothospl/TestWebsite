package org.gothos.aps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserUtils {
	
	private UserUtils() {
		throw new IllegalStateException("Utility class");
	}
	
	static void addUser(WebDriver driver, String username, String password, String address) {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		driver.navigate().to(address);
		WebElement logInLink = driver.findElement(By.cssSelector(".login"));
		logInLink.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email_create")));
		
		WebElement emailCreateField = driver.findElement(By.cssSelector("#email_create"));
		WebElement createAnAccountButton = driver.findElement(By.cssSelector("#SubmitCreate"));
		emailCreateField.sendKeys(username);
		createAnAccountButton.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input")));
		
		WebElement addUserName = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		WebElement addPassword = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		WebElement saveButton = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
		
		addUserName.sendKeys(username);
		addPassword.sendKeys(password);
		saveButton.click();
		
	}

}
