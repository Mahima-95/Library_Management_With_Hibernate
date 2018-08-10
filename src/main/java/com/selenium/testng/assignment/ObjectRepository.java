package com.selenium.testng.assignment;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ObjectRepository {
	@Test
	public void test() throws IOException, InterruptedException {

		// fetch file data
		File file = new File("D:\\Charter\\workspace\\Selenium\\src\\OR.properties");
		// read file
		FileReader fileReader = new FileReader(file);
		Properties properties = new Properties();
		properties.load(fileReader);

		WebDriver driver = new FirefoxDriver();
		driver.get("https://intranet.xavient.com/XAP/");
		driver.findElement(By.id(properties.getProperty("UnameID"))).sendKeys("mahima");
		driver.findElement(By.id(properties.getProperty("password"))).sendKeys("mahima");
		Thread.sleep(2000);
		driver.close();
	}
}
