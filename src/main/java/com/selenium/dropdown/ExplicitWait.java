package com.selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://intranet.xavient.com/XAP/");
		driver.findElement(By.id("txtLoginName")).sendKeys("mahima");
		driver.findElement(By.id("txtPassword")).sendKeys("agrawal");
		WebDriverWait driverWait = new WebDriverWait(driver, 25);
		WebElement element = driver.findElement(By.id("txtPassword"));
		driverWait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
