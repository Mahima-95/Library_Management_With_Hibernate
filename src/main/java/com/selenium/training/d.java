package com.selenium.training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class d {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.w3resource.com/java-tutorial/");
		driver.findElement(By.id("dLabel3")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//ul[@class='dropdown-menu'])[2]"));
		List<WebElement> elecount = ele.findElements(By.tagName("li"));
		// System.out.println(elecount.get(0).getText());
		elecount.size();

	}

}
