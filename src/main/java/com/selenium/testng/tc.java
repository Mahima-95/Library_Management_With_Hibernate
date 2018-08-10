package com.selenium.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tc {

	WebDriver driver;

	@Test
	public void m() {
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println("Title Name" + title);
		Assert.assertEquals(title, "Facebook – log in or sign up");

	}

}
