package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actionss {
	
	@Test
	public void m() throws InterruptedException
	{
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://10.5.2.13/tester");
		
		WebElement ele = driver.findElement(By.xpath("//a[@href='/couchbase']"));
		Actions ac = new Actions(driver);	
		Thread.sleep(2000);
		ac.contextClick(ele).perform();
		
		
		
	}

}
