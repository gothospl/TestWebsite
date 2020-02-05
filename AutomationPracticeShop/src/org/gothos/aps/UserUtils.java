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
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customer_firstname")));
		
		WebElement userTitleMr = driver.findElement(By.cssSelector("#id_gender1"));
		WebElement userTitleMrs = driver.findElement(By.cssSelector("#id_gender2"));
		WebElement customerFirstNameField = driver.findElement(By.cssSelector("#customer_firstname"));
		WebElement customerLastNameField = driver.findElement(By.cssSelector("customer_lastname"));
		WebElement customerEmailAddressField = driver.findElement(By.cssSelector("#email"));
		WebElement customerPasswordField = driver.findElement(By.cssSelector("#passwd"));
		WebElement customerDOB_DayMenu = driver.findElement(By.cssSelector("#days"));
		WebElement customerDOB_MonthMenu = driver.findElement(By.cssSelector("#months"));
		WebElement customerDOB_YearMenu = driver.findElement(By.cssSelector("#years"));
		WebElement newsletterCheckbox = driver.findElement(By.cssSelector("#newsletter"));
		WebElement optInCheckbox = driver.findElement(By.cssSelector("#optin"));
		
		WebElement addressFirstNameField = driver.findElement(By.cssSelector("#firstname"));
		WebElement addressLastNameField = driver.findElement(By.cssSelector("#lastname"));
		WebElement addressCompanyField = driver.findElement(By.cssSelector("#company"));
		WebElement addressAddress1Field = driver.findElement(By.cssSelector("#address1"));
		WebElement addressAddress2Field = driver.findElement(By.cssSelector("#address2"));
		WebElement addressCityField = driver.findElement(By.cssSelector("#city"));
		WebElement addressStateMenu = driver.findElement(By.cssSelector("#id_state"));
		WebElement addressZipCodeField = driver.findElement(By.cssSelector("#postcode"));
		WebElement addressCountryMenu = driver.findElement(By.cssSelector("#id_country"));
		WebElement addressAdditionalField = driver.findElement(By.cssSelector("#other"));
		WebElement addressHomePhoneField = driver.findElement(By.cssSelector("#phone"));
		WebElement addressMobilePhoneField = driver.findElement(By.cssSelector("#phone_mobile"));
		WebElement addressAliasField = driver.findElement(By.cssSelector("#alias"));
		WebElement registerButton = driver.findElement(By.cssSelector("#submitAccount"));
		
	}

}
