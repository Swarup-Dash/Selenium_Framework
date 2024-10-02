package com.selenium.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browsersfactory {
	static WebDriver driver;
	
	public static void openBrowsers(String browser, String url) {
		
		
		switch(browser) {
		case "chrome":
			Drivermanager.setDriver(new ChromeDriver());
			break;
			
		case "firefox":
			Drivermanager.setDriver(new FirefoxDriver());
			break;
			
		case "edge":
			Drivermanager.setDriver(new EdgeDriver());
			break;
			
		default:
			Drivermanager.setDriver(new ChromeDriver());
		}
		driver=Drivermanager.getDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	public static void close() {
		driver.quit();
		Drivermanager.removeThreadLocal();
	}

}
