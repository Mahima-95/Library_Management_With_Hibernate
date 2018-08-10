package com.selenium.dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://intranet.xavient.com/XAP/");
		driver.findElement(By.id("txtLoginName")).sendKeys("mahima");

		// this line of code will wait 20 seconds to find the id of password,
		// if there is something wrong in id
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("txtPassword1")).sendKeys("agrawal");

		String title = "XAP";
		String title1 = "";

		// to maximize the browser
		driver.manage().window().maximize();

		// to get the title of the page
		title1 = driver.getTitle();

		// to comapre the title
		if (title1.equals(title)) {
			System.out.println("title passed..!!!");
		} else {
			System.out.println("title failed..!!!");
		}

		// close the browser
		driver.close();
	}
}
