package org.gothos.tds;

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
		WebElement addUserLink = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
		addUserLink.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("WebDriverWait wait = new WebDriverWait(driver, 60);")));
		
		WebElement addUserName = driver.findElement(By.cssSelector(".auto-style1 > form:nth-child(6) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > p:nth-child(1) > input:nth-child(1)"));
		WebElement addPassword = driver.findElement(By.cssSelector(".auto-style1 > form:nth-child(6) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(2) > p:nth-child(1) > input:nth-child(1)"));
		WebElement saveButton = driver.findElement(By.cssSelector(".auto-style1 > form:nth-child(6) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(2) > p:nth-child(1) > input:nth-child(1)"));
		
		addUserName.sendKeys(username);
		addPassword.sendKeys(password);
		saveButton.click();
		
	}
	
	static void loginUser(WebDriver driver, String username, String password) {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		WebElement linkToLogin = driver.findElement(By.cssSelector("body > div:nth-child(1) > center:nth-child(1) > table:nth-child(6) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1) > div:nth-child(2) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > p:nth-child(1) > small:nth-child(1) > a:nth-child(7)"));
		linkToLogin.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".auto-style1 > form:nth-child(8) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > p:nth-child(1) > input:nth-child(1)")));
		
		WebElement loginUserName = driver.findElement(By.cssSelector(".auto-style1 > form:nth-child(8) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > p:nth-child(1) > input:nth-child(1)"));
		WebElement loginPassword = driver.findElement(By.cssSelector(".auto-style1 > form:nth-child(8) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(2) > p:nth-child(1) > input:nth-child(1)"));
		WebElement loginButton = driver.findElement(By.cssSelector(".auto-style1 > form:nth-child(8) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(2) > p:nth-child(1) > input:nth-child(1)"));
		
		loginUserName.sendKeys(username);
		loginPassword.sendKeys(password);
		loginButton.click();
	}
	
}
