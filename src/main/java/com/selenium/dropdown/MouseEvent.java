package com.selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.geeksforgeeks.org/");
		WebElement element = driver.findElement(By.xpath("//li[@id='menu-item-147478']"));
		Actions actions = new Actions(driver);
		Thread.sleep(2000);

		// for right click
		// actions.contextClick(element).perform();

		// mouse hover
		actions.moveToElement(element).perform();
	}
}
