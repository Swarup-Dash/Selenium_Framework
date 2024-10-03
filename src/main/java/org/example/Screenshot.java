package com.selenium.framework;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Screenshot {
	
	public static WebDriver driver =Drivermanager.getDriver();
	
	public static void takeScreenshot(String filename) throws WebDriverException, IOException {
		
		try {
			String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
//			Date date = new Date();
//			Object Time =date.getTime();
			
			TakesScreenshot screenshot = ((TakesScreenshot) driver);
			
			File src = screenshot.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("./Selenium Framework/framework/screenshoot"+filename+"timeStamp"+".png");
			
			FileUtils.copyFile(src, dest);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
