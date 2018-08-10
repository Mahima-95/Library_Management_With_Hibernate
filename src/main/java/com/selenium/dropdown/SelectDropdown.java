package com.selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get(
				"https://signup.live.com/signup?lcid=1033&wa=wsignin1.0&rpsnv=13&ct=1503989249&rver=6.7.6640.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26signup%3d1%26RpsCsrfState%3d738c8ea4-61f0-fb07-737f-1a099fbc15bb&id=292841&CBCXT=out&fl=wld&cobrandid=90015&uaid=856385b889014c008969bb95dbd5062d&lic=1");

		WebElement element = driver.findElement(By.id("BirthMonth"));
		Thread.sleep(2000);

		Select select = new Select(element);
		// select.selectByIndex(1);
		select.selectByValue("5");
	}
}
