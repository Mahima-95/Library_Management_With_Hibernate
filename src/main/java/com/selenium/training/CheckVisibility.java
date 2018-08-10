package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CheckVisibility {

	WebDriver driver;

	@Test
	public void m() {
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.findElement(By.id("u_0_2")).isDisplayed());
	}

}
