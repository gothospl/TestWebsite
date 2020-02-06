package org.gothos.aps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		WebElement userTitleMr = driver.findElement(By.cssSelector("div.radio-inline:nth-child(3)"));		
		userTitleMr.click(); 
			
				
	}

}
