package org.gothos.aps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customer_firstname")));
		
		WebElement userTitleMr = driver.findElement(By.cssSelector("#id_gender1"));
		WebElement userTitleMrs = driver.findElement(By.cssSelector("#id_gender2"));
		WebElement customerFirstNameField = driver.findElement(By.cssSelector("#customer_firstname"));
		WebElement customerLastNameField = driver.findElement(By.cssSelector("customer_lastname"));
		WebElement customerEmailAddressField = driver.findElement(By.cssSelector("#email"));
		WebElement customerPasswordField = driver.findElement(By.cssSelector("#passwd"));
		Select customerDOB_DayMenu = new Select (driver.findElement(By.cssSelector("#days")));
		Select customerDOB_MonthMenu = new Select (driver.findElement(By.cssSelector("#months")));
		Select customerDOB_YearMenu = new Select(driver.findElement(By.cssSelector("#years")));
		WebElement newsletterCheckbox = driver.findElement(By.cssSelector("#newsletter"));
		WebElement optInCheckbox = driver.findElement(By.cssSelector("#optin"));		
		WebElement addressFirstNameField = driver.findElement(By.cssSelector("#firstname"));
		WebElement addressLastNameField = driver.findElement(By.cssSelector("#lastname"));
		WebElement addressCompanyField = driver.findElement(By.cssSelector("#company"));
		WebElement addressAddress1Field = driver.findElement(By.cssSelector("#address1"));
		WebElement addressAddress2Field = driver.findElement(By.cssSelector("#address2"));
		WebElement addressCityField = driver.findElement(By.cssSelector("#city"));
		Select addressStateMenu = new Select(driver.findElement(By.cssSelector("#id_state")));
		WebElement addressZipCodeField = driver.findElement(By.cssSelector("#postcode"));
		Select addressCountryMenu = new Select (driver.findElement(By.cssSelector("#id_country")));
		WebElement addressAdditionalField = driver.findElement(By.cssSelector("#other"));
		WebElement addressHomePhoneField = driver.findElement(By.cssSelector("#phone"));
		WebElement addressMobilePhoneField = driver.findElement(By.cssSelector("#phone_mobile"));
		WebElement addressAliasField = driver.findElement(By.cssSelector("#alias"));
		WebElement registerButton = driver.findElement(By.cssSelector("#submitAccount"));
		
		if (gender instanceof String) { if(gender == "Male") { userTitleMr.click(); } else if (gender == "Female") { userTitleMrs.click();} }
		
		customerFirstNameField.sendKeys(firstname);
		customerLastNameField.sendKeys(lastname);
		customerEmailAddressField.sendKeys(useremail);
		customerPasswordField.sendKeys(password);
		if (dobday instanceof String) { customerDOB_DayMenu.selectByVisibleText(dobday); }
		if (dobmonth instanceof String) { customerDOB_MonthMenu.selectByVisibleText(dobmonth); }
		if (dobyear instanceof String) { customerDOB_YearMenu.selectByVisibleText(dobyear); }
		if (newsletter instanceof String) { if (newsletter == "Yes") { newsletterCheckbox.click(); } }
		if (optin instanceof String) { if (optin == "Yes") { optInCheckbox.click(); } }
		addressFirstNameField.sendKeys(firstname);
		addressLastNameField.sendKeys(lastname);
		addressCompanyField.sendKeys(companyname);
		addressAddress1Field.sendKeys(address1);
		if (address2 instanceof String) { addressAddress2Field.sendKeys(address2); }
		addressCityField.sendKeys(city);
		addressStateMenu.selectByVisibleText(state);
		addressZipCodeField.sendKeys(zipcode);
		addressCountryMenu.deselectByVisibleText(country);
		if (additional instanceof String) { addressAdditionalField.sendKeys(additional); }
		addressHomePhoneField.sendKeys(homephone);
		addressMobilePhoneField.sendKeys(mobilephone);
		addressAliasField.sendKeys(alias);
		// registerButton.click();
		
	}

}
