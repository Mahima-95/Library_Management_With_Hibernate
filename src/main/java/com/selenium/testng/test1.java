package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test1 extends datprovider {
		
	WebDriver driver;
	
	@Test(dataProvider="ExcelData1")
	public void m(String uname,String  pwd)
	{
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);

		
	}

}
