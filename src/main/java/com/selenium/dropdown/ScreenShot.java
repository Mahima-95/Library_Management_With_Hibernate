package com.selenium.dropdown;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.geeksforgeeks.org/");
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("D:\\Charter\\workspace\\Selenium\\picture\\screenshot.png"));
	}
}
