package com.selenium.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ListDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.geeksforgeeks.org/");

		driver.findElement(By.id("menu-item-147478")).click();
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.xpath("//li[@id='menu-item-147478']"));
		List<WebElement> element = ele.findElements(By.tagName("li"));
		System.out.println(element.get(2).getText());
		element.get(2).click();
	}
}
