package com.selenium.framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestDropDown {
	
	public static WebDriver driver =Drivermanager.getDriver();
	
	public static void dropDownTest(WebElement dropdownID, String option) {
//		WebElement dropdown = driver.findElement(By.id(dropdownId));
//		dropdown.click();
//		
//		WebElement dropdownOption = driver.findElement(By.xpath(option));
//		dropdownOption.click();
		
		
		List<WebElement> options = driver.findElements(By.id(dropdownId));
		for(WebElement choise:options) {
			if(choise.getText().equals("option")) {
				choise.click();
				break;
			}
		}
		
	}
	
//	public static void selectDropdown();
	
}
