package com.selenium.testng;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC1 {
	
WebDriver driver;
	

	@Test
	public void m() throws IOException
	{
		File f = new File("D:\\SeleniumTraining\\testng\\OR.properties");
		FileReader fr = new FileReader(f);
		Properties pr = new Properties();
		pr.load(fr);
		
		driver = new FirefoxDriver();
		driver.get("https://intranet.xavient.com/XAP/");
		driver.findElement(By.id(pr.getProperty("unameID"))).sendKeys("umendra");
		driver.findElement(By.id(pr.getProperty("pwdID"))).sendKeys("umendra");
		
	}

}
