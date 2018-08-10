package com.selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class EnableWebElement {
	@Test
	public void m()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://intranet.xavient.com/XAP/");
		System.out.println(driver.findElement(By.id("btnLogin")).isEnabled());
	}
}
