package org.gothos.tds;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class MainTest {
	
	public static final FirefoxOptions options = new FirefoxOptions(); 
	public static final SoftAssert sa = new SoftAssert();
  
  @Parameters ({ "username", "password", "address", "expMsg" })
  @Test
  public void CreateUser(String username, String password, String address, String expMsg) {
	  
	  WebDriver driver = new FirefoxDriver(options);
	  UserUtils.addUser(driver, username, password, address);
	  UserUtils.loginUser(driver, username, password);
	  String bodyText = driver.findElement(By.tagName("body")).getText();
	  sa.assertTrue(bodyText.contains(expMsg), "Login successful!");
	  sa.assertAll();
	  driver.quit();
  }
  @Parameters ({ "geckoPath" })	  
  @BeforeSuite
  public void beforeSuite(String geckoPath) {
	  options.setCapability("marionette", true);
	  options.addPreference("browser.link.open_newwindow", 1);
	  System.setProperty("webdriver.gecko.driver", "//home//bartek//Downloads//geckodriver-v0.26.0-linux64//geckodriver");
	  
  }

 

}
