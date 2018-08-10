package com.selenium.dropdown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://ambitionally.com/generate-more-leads/popups/best-pop-up-examples/");
		driver.findElement(By.className("popupally-pro-close popup-click-close-trigger-24")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.dismiss();
	}
}
