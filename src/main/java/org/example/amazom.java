package com.selenium.framework;

public class amazom {
	
	public static void main(String[] args) {
		browsersfactory.openBrowsers("chrome", "https://www.amazon.com");
		browsersfactory.openBrowsers("edge", "https://www.amazon.com");
		browsersfactory.openBrowsers("firefox", "https://www.amazon.com");
		
		browsersfactory.close();
	}

}
