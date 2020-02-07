package org.gothos.aps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoddamnRadios {
	
	private GoddamnRadios() {
		throw new IllegalStateException("Utility class");
	}
	
	static void go(WebDriver driver, String gender) {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email_create")));
		
		WebElement emailCreateField = driver.findElement(By.cssSelector("#email_create"));
		WebElement createAnAccountButton = driver.findElement(By.cssSelector("#SubmitCreate"));
		emailCreateField.sendKeys("lalalafla@lalalala.com");
		createAnAccountButton.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#id_gender1")));
		
		WebElement userTitleMr = driver.findElement(By.cssSelector("#id_gender1"));
		WebElement newsletterCheckbox = driver.findElement(By.cssSelector("#newsletter"));
		WebElement optInCheckbox = driver.findElement(By.cssSelector("#optin"));
		
		System.out.println(userTitleMr.isDisplayed());
		System.out.println(userTitleMr.isEnabled());
		
		Actions action = new Actions(driver);
		action.moveToElement(userTitleMr);
		
		userTitleMr.click();		
		userTitleMr.click();		
		newsletterCheckbox.click();	
		optInCheckbox.click();
		
		
		//Select userTitle = new Select(driver.findElement(By.name("//*[@name=\"id_gender\"]"))); 
		//userTitle.selectByValue("1");
				
	}

}
