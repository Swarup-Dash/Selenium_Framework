package com.selenium.framework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazom {
	
	@Test
	public void test() {
		browsersfactory.openBrowsers("chrome", "https://www.saucedemo.com/v1/");
//		browsersfactory.openBrowsers("edge", "https://www.saucedemo.com/v1/");
//		browsersfactory.openBrowsers("firefox", "https://www.saucedemo.com/v1/");
		
		WebDriver driver = Drivermanager.getDriver();
		
		WebElement inputbox = driver.findElement(By.id("user-name"));
		Wait.elementTobeClickable(inputbox, 30);
		inputbox.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.id("password"));
		Wait.elementTobeClickable(password, 30);
		password.sendKeys("secret_sauce");
		
		WebElement submit = driver.findElement(By.id("login-button"));
		Wait.elementTobeClickable(submit, 10);
		submit.click();
		
//		browsersfactory.close();
	}

}
