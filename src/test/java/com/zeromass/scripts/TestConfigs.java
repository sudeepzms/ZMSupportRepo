 package com.zeromass.scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.zeromass.drivers.MyDriverUtil;

public class TestConfigs {
	
	public static Properties properties;
	
	@BeforeSuite
	public void beforeClass() {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(new File("src/test/resources/testdata.properties")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		TestConfigs.properties = properties;
	}
	
//	@AfterSuite
//	public void afterSuite() {
//		MyDriverUtil.getDriver().quit();
//	}

}
