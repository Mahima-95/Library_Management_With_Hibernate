package com.selenium.testng.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class IFrames {

	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get(
				"https://developer.mozilla.org/en-US/docs/Learn/HTML/Multimedia_and_embedding/Other_embedding_technologies");

		// maximize the window
		driver.manage().window().maximize();

		// come to frame
		driver.switchTo().frame("frame_Playable_code");

		// find elements
		driver.findElement(By.id("code")).sendKeys("mahima");

		// for wait 3s
		Thread.sleep(3000);

		// clear the field text
		driver.findElement(By.id("code")).clear();

		// close the window
		driver.close();
	}
}
