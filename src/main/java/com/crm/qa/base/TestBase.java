package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.qa.util.TestUtil;



public class TestBase {

	 public static WebDriver driver;
	 public static Properties prop;
	
	
	public TestBase() throws Exception {
	 
			 prop = new Properties();
			 FileInputStream ip= new FileInputStream("E:\\New_work\\FreeCRM\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			 
			prop.load(ip);
			
			System.out.println(prop.getProperty("url"));
		

	}
	
	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New_work\\work\\Driver\\chromedriver.exe");
		 driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("My currect url"+prop.getProperty("url"));
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		System.out.println("Login to the application");
		
		
		
	}

}
