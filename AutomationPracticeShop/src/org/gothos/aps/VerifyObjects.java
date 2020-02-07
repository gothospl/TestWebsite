package org.gothos.aps;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyObjects {
	
	private VerifyObjects() {
		throw new IllegalStateException("Utility class");
	}
	
	static void accountTabs(WebDriver driver) {
		
		WebElement orderHistory = driver.findElement(By.cssSelector("div.col-sm-6:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)"));
		WebElement creditSlips = driver.findElement(By.cssSelector("div.col-sm-6:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)"));
		WebElement myAddresses = driver.findElement(By.cssSelector("div.col-sm-6:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)"));
		WebElement personalInfo = driver.findElement(By.cssSelector("div.col-sm-6:nth-child(1) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)"));
		WebElement myWishlists = driver.findElement(By.cssSelector(".lnk_wishlist > a:nth-child(1) > span:nth-child(2)"));
		WebElement homeButton = driver.findElement(By.cssSelector(".footer_links > li:nth-child(1) > a:nth-child(1)"));
		WebElement shoppingCart = driver.findElement(By.cssSelector(".shopping_cart > a:nth-child(1)"));
		
		System.out.println(orderHistory.isDisplayed());
		System.out.println(creditSlips.isDisplayed());
		System.out.println(myAddresses.isDisplayed());
		System.out.println(personalInfo.isDisplayed());
		System.out.println(myWishlists.isDisplayed());
		System.out.println(homeButton.isDisplayed());
		System.out.println(shoppingCart.isDisplayed());
	}

	static void elementList(WebDriver driver) {
		List<WebElement> listElements = driver.findElements(By.xpath("//li[*]"));
		System.out.println("Amount of <li> elements: " + listElements.size());
		Iterator<WebElement> iter = listElements.iterator();
		int i = 0;
		
		while (iter.hasNext()) {
			if (iter.next().getText() != null) {
			i += 1;
			System.out.println(i + ". " + iter.next().getText());
			}
		}
	}
}
