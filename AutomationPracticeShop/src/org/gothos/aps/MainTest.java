package org.gothos.aps;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class MainTest {
	
	public static final FirefoxOptions options = new FirefoxOptions(); 
	public static final SoftAssert sa = new SoftAssert();
  
  @Parameters ({ "useremail", "password", "address", "firstname", "lastname", "dobday", "dobmonth", "dobyear", "companyname", "address1", "address2", "city", "state", "zipcode", "country", "additional", "homephone", "mobilephone", "alias", "gender", "newsletter", "optin" })
  @Test(enabled=false)
  public void CreateUser(String useremail, String password, String address, String firstname, String lastname, @Optional String dobday, @Optional String dobmonth, @Optional String dobyear, @Optional String companyname, String address1, @Optional String address2, String city, String state, String zipcode, String country, @Optional String additional, String homephone, String mobilephone, String alias, @Optional String gender, @Optional String newsletter, @Optional String optin) {  
	  WebDriver driver = new FirefoxDriver(options);
	  UserUtils.addUser(driver, useremail, password, address, firstname, lastname, dobday, dobmonth, dobyear, companyname, address1, address2, city, state, zipcode, country, additional, homephone, mobilephone, alias, gender, newsletter, optin);
	  driver.close();
	  driver.quit();	  
  }
  
  @Parameters ({ "useremail", "password", "address" })
  @Test(enabled=true)
  public void SignInUser(String useremail, String password, String address) {
	  WebDriver driver = new FirefoxDriver(options);
	  UserUtils.signInUser(driver, useremail, password, address);
	  driver.close();
	  driver.quit();
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
