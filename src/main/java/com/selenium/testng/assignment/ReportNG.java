package com.selenium.testng.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReportNG {

	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://intranet.xavient.com/XAP/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title--> " + title);
		driver.close();
	}
}
