package org.gothos.aps;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;

public class MainTest {
	
	public static final FirefoxOptions options = new FirefoxOptions(); 
	public static final SoftAssert sa = new SoftAssert();
	
  @Test
  public void CreateUser(String username, String password, String address) {
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
