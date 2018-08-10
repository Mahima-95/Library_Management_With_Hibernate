package com.selenium.dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assert {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://intranet.xavient.com/XAP/");
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
