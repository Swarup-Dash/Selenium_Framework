package com.selenium.framework;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.devtools.v116.runtime.model.TimeDelta;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	public static WebDriver driver =Drivermanager.getDriver();
	
	public static boolean visibilityOfElement(WebElement locator, int sec) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOfAllElements(locator));
		return false;
	}
	
	public static void elementTobeClickable(WebElement locator, int sec) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static void invisibilityOfElement(WebElement locator, int sec) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.invisibilityOf(locator));
	}
	
	public static void implicitwait(Duration sec) {
		driver.manage().timeouts().implicitlyWait(sec);
	}
	
}
