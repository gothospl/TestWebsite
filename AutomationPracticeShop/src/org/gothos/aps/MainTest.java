package org.gothos.aps;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class MainTest {
	
	public static final FirefoxOptions options = new FirefoxOptions(); 
	public static final SoftAssert sa = new SoftAssert();
  
  @Parameters ({ "useremail", "password", "address", "firstname", "lastname", "dobday", "dobmonth", "dobyear", "companyname", "address1", "address2", "city", "state", "zipcode", "country", "additional", "homephone", "mobilephone", "alias", "gender", "newsletter", "optin", "expMsg" })
  @Test(enabled=false)
  public void CreateUser(String useremail, String password, String address, String firstname, String lastname, @Optional String dobday, @Optional String dobmonth, @Optional String dobyear, @Optional String companyname, String address1, @Optional String address2, String city, String state, String zipcode, String country, @Optional String additional, String homephone, String mobilephone, String alias, @Optional String gender, @Optional String newsletter, @Optional String optin, String expMsg) {  
	  WebDriver driver = new FirefoxDriver(options);
	  UserUtils.addUser(driver, useremail, password, address, firstname, lastname, dobday, dobmonth, dobyear, companyname, address1, address2, city, state, zipcode, country, additional, homephone, mobilephone, alias, gender, newsletter, optin, expMsg);
	  String bodyText = driver.findElement(By.tagName("body")).getText();
	  sa.assertTrue(bodyText.contains(expMsg), "User account creation successful!");  
  }
  
  @Parameters ({ "useremail", "password", "address", "expMsg" })
  @Test(enabled=true)
  public void SignIn(String useremail, String password, String address, String expMsg) {
	  WebDriver driver = new FirefoxDriver(options);
	  UserUtils.signIn(driver, useremail, password, address);
	  String bodyText = driver.findElement(By.tagName("body")).getText();
	  sa.assertTrue(bodyText.contains(expMsg), "User account creation successful!");
	  UserUtils.signOut(driver);
  }
  
  @Parameters ({ "gender" })
  @Test(enabled=false)
  public void GoddamnRadios(String gender) {
	  WebDriver driver = new FirefoxDriver(options);
	  GoddamnRadios.go(driver, gender);
  }
  
  @Parameters ({ "geckoPath" })
  @BeforeSuite
  public void beforeSuite(String geckoPath) {
	  options.setCapability("marionette", true);
	  options.addPreference("browser.link.open_newwindow", 1);
	  System.setProperty("webdriver.gecko.driver", geckoPath);
  }
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
