package com.selenium.dropdown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollPage {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.geeksforgeeks.org/");

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		driver.manage().window().maximize();
		executor.executeScript("window.scrollBy(0,3000)", "");

	}
}
