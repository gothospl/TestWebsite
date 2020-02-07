package org.gothos.aps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class UserUtils {
	
	private UserUtils() {
		throw new IllegalStateException("Utility class");
	}
	
	static void addUser(WebDriver driver, String useremail, String password, String address, String firstname, String lastname, String dobday, String dobmonth, String dobyear, String companyname, String address1, String address2, String city, String state, String zipcode, String country, String additional, String homephone, String mobilephone, String alias, String gender, String newsletter, String optin) {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		driver.navigate().to(address);
		WebElement logInLink = driver.findElement(By.cssSelector(".login"));
		logInLink.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email_create")));
		
		WebElement emailCreateField = driver.findElement(By.cssSelector("#email_create"));
		WebElement createAnAccountButton = driver.findElement(By.cssSelector("#SubmitCreate"));
		emailCreateField.sendKeys(useremail);
		createAnAccountButton.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#id_gender1")));
		
		WebElement userTitleMr = driver.findElement(By.cssSelector("div.radio-inline:nth-child(3)"));
		WebElement userTitleMrs = driver.findElement(By.cssSelector("div.radio-inline:nth-child(4)"));
		WebElement customerFirstNameField = driver.findElement(By.cssSelector("#customer_firstname"));
		WebElement customerLastNameField = driver.findElement(By.cssSelector("#customer_lastname"));
		WebElement customerEmailAddressField = driver.findElement(By.cssSelector("#email"));
		WebElement customerPasswordField = driver.findElement(By.cssSelector("#passwd"));
		WebElement customerDOB_DayField = driver.findElement(By.cssSelector("#days")); Select customerDOB_DayMenu = new Select (customerDOB_DayField);
		WebElement customerDOB_MonthField = driver.findElement(By.cssSelector("#months")); 
		WebElement customerDOB_YearField = driver.findElement(By.cssSelector("#years")); Select customerDOB_YearMenu = new Select (customerDOB_YearField);
		WebElement newsletterCheckbox = driver.findElement(By.cssSelector("#newsletter"));
		WebElement optInCheckbox = driver.findElement(By.cssSelector("#optin"));		
		WebElement addressFirstNameField = driver.findElement(By.cssSelector("#firstname"));
		WebElement addressLastNameField = driver.findElement(By.cssSelector("#lastname"));
		WebElement addressCompanyField = driver.findElement(By.cssSelector("#company"));
		WebElement addressAddress1Field = driver.findElement(By.cssSelector("#address1"));
		WebElement addressAddress2Field = driver.findElement(By.cssSelector("#address2"));
		WebElement addressCityField = driver.findElement(By.cssSelector("#city"));
		WebElement addressStateField = driver.findElement(By.cssSelector("#id_state")); Select addressStateMenu = new Select(addressStateField);
		WebElement addressZipCodeField = driver.findElement(By.cssSelector("#postcode"));
		WebElement addressCountryField = driver.findElement(By.cssSelector("#id_country")); Select addressCountryMenu = new Select(addressCountryField);
		WebElement addressAdditionalField = driver.findElement(By.cssSelector("#other"));
		WebElement addressHomePhoneField = driver.findElement(By.cssSelector("#phone"));
		WebElement addressMobilePhoneField = driver.findElement(By.cssSelector("#phone_mobile"));
		WebElement addressAliasField = driver.findElement(By.cssSelector("#alias"));
		WebElement registerButton = driver.findElement(By.cssSelector("#submitAccount"));
		Actions action = new Actions(driver);
		
		action.moveToElement(userTitleMr);
		wait.until(ExpectedConditions.elementToBeClickable(userTitleMr));
		
		if (gender instanceof String) { 
			if(gender.equals("Male")) {
				action.moveToElement(userTitleMr);
				userTitleMr.click(); userTitleMr.click(); } 
			else if (gender.equals("Female")) {
				action.moveToElement(userTitleMrs);
				userTitleMrs.click(); userTitleMrs.click(); } 
		}
		customerFirstNameField.sendKeys(firstname);
		customerLastNameField.sendKeys(lastname);
		customerEmailAddressField.click();
		customerPasswordField.sendKeys(password);
		if (dobday instanceof String) { customerDOB_DayField.click(); customerDOB_DayMenu.selectByValue(dobday); }
		if (dobmonth instanceof String) { customerDOB_MonthField.click(); customerDOB_MonthField.sendKeys(dobmonth);; }
		if (dobyear instanceof String) { customerDOB_YearField.click(); customerDOB_YearMenu.selectByValue(dobyear); }
		if (newsletter instanceof String) { if (newsletter.equals("Yes")) { newsletterCheckbox.click(); } }
		if (optin instanceof String) { if (optin.equals("Yes")) { optInCheckbox.click(); } }
		addressFirstNameField.click();
		addressLastNameField.click();
		addressCompanyField.sendKeys(companyname);
		addressAddress1Field.sendKeys(address1);
		if (address2 instanceof String) { addressAddress2Field.sendKeys(address2); }
		addressCityField.sendKeys(city);
		addressStateField.click(); addressStateMenu.selectByVisibleText(state);
		addressZipCodeField.sendKeys(zipcode);
		addressCountryField.click(); addressCountryMenu.selectByVisibleText(country);
		if (additional instanceof String) { addressAdditionalField.sendKeys(additional); }
		addressHomePhoneField.sendKeys(homephone);
		addressMobilePhoneField.sendKeys(mobilephone);
		addressAliasField.clear(); addressAliasField.sendKeys(alias);
		
		
		registerButton.click();
		
	}
	
	static void signInUser(WebDriver driver, String useremail, String password, String address) {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		driver.navigate().to(address);
		WebElement logInLink = driver.findElement(By.cssSelector(".login"));
		logInLink.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email_create")));		
		
	}
}
