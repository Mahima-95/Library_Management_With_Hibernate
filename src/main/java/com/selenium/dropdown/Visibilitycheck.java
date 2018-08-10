package com.selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Visibilitycheck {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://intranet.xavient.com/XAP/");
//	System.out.println(driver.findElement(By.id("u_0_2")).isDisplayed());
	System.out.println(driver.findElement(By.id("submit")).isDisplayed());
}
}
