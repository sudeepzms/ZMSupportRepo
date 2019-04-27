package com.zeromass.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriverUtil {
	
	private static  WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public MyDriverUtil() {
			
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}
