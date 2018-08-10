package com.selenium.testng.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertQues {

	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://intranet.xavient.com/XAP/");
		String title = driver.getTitle();
		System.out.println("Title--> " + title);
		Assert.assertEquals(title, "XAP");
		driver.close();
	}
}
