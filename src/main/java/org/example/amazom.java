package com.selenium.framework;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class amazom {
	WebElement drop =Drivermanager.getDriver().findElement(By.className(""));
	
	
	@Test
	public void test() {
		
		FileReader reader=new FileReader("E:\\Selenium Framework\\framework\\src\\main\\java\\com\\selenium\\framework\\config\\TestData.properties\\"); 
        Properties props=new Properties(); 
        props.load(reader); 
		
		browsersfactory.openBrowsers("chrome", props.getProperty("url"));
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
		
		TestDropDown.dropDownTest(drop, "Dev");
		
		WebElement dropdown = driver.findElement(By.id(""));
		TestDropDown.dropDownTest(dropdown, "option 2");
		
		Screenshot.takeScreenshot("firstScreenshot");
//		browsersfactory.close();
		
	
	}

}
