package com.selenium.testng.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassValueWithParameters {

	@Parameters({ "userName", "passWord" })
	@Test
	public void test(String userName, String passWord) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://intranet.xavient.com/XAP/");
		driver.findElement(By.id("txtLoginName")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);
	}
}
