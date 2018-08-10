package com.selenium.testng.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestDataProvider extends DataProviderForTest {
	WebDriver driver;

	@Test(dataProvider = "ExcelData")
	public void test(String userName, String passWord) {
		driver = new FirefoxDriver();
		driver.get("https://intranet.xavient.com/XAP/");
		driver.findElement(By.id("txtLoginName")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);
		driver.close();
	}
}
