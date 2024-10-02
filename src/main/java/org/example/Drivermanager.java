package com.selenium.framework;

import org.openqa.selenium.WebDriver;

public class Drivermanager {
	
	private static final ThreadLocal<WebDriver> threadlocalWebDriver = new ThreadLocal<>();
	public static WebDriver getDriver() {
		return threadlocalWebDriver.get();
	}
	public static void setDriver(WebDriver driver) {
		threadlocalWebDriver.set(driver);
	}
	
	public static void removeThreadLocal() {
		threadlocalWebDriver.remove();
	}
}
