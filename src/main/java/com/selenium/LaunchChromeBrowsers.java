package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowsers {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Charter\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://intranet.xavient.com/XAP/");
		// locate using class name
		driver.findElement(By.id("txtLoginName")).sendKeys("mahima");

		// locate using id
		driver.findElement(By.id("txtPassword")).sendKeys("agrawal");

		driver.findElement(By.id("btnLogin")).click();
	}
}
