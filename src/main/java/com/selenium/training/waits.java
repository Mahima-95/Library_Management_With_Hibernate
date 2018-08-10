package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class waits 
{

WebDriver driver;
	
	@Test
	public void m()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("umendra");
		driver.findElement(By.id("pass")).sendKeys("singh");
		WebDriverWait wait= new WebDriverWait(driver, 20);
		WebElement ele=driver.findElement(By.id("pass"));
		wait.until(ExpectedConditions.elementToBeClickable(ele));

		
	}
	
	
}
