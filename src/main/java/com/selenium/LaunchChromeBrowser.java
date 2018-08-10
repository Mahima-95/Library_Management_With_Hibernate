package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Charter\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://signup.live.com/signup?lcid=1033&wa=wsignin1.0&rpsnv=13&ct=1503989249&rver=6.7.6640.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26signup%3d1%26RpsCsrfState%3d738c8ea4-61f0-fb07-737f-1a099fbc15bb&id=292841&CBCXT=out&fl=wld&cobrandid=90015&uaid=856385b889014c008969bb95dbd5062d&lic=1");
		
		// locate using class name
		driver.findElement(By.className("form-control")).sendKeys("mahima");

		// locate using id
		driver.findElement(By.id("LastName")).sendKeys("agrawal");

		// locate using css selector (tagname with id)
		driver.findElement(By.tagName("input").id("MemberName")).sendKeys("agg.mahima");

		// locate using css selector (tagname with class name)
		// some problem in this statement
		//driver.findElement(By.tagName("input").className("form-control")).sendKeys("1122223333");
		
		//driver.findElement(By.cssSelector("tooltip"));

	}
}
