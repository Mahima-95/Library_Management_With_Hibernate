package com.selenium.dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeBrowser {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.geeksforgeeks.org/");
		driver.manage().window().maximize();
	}
}
