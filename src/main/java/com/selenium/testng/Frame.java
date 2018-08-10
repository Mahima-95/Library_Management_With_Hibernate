package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Frame {
	@Test
	public void m() {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		 driver.switchTo().frame("IF2");
		 driver.findElement(By.id("datepicker")).sendKeys("umendra");
		System.out.println(driver.findElement(By.xpath(".//*[text()='Unique & Clean']")).getText());

	}
}