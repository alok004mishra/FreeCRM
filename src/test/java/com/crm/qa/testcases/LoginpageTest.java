package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.page.Homepage;
import com.crm.qa.page.LoginPage;

public class LoginpageTest extends TestBase {
	
	public LoginPage loginpageuse;
	Homepage homepage;
	
	public LoginpageTest() throws Exception
	{
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws Exception
	{
		
		initialization(); 
		loginpageuse = new LoginPage();
		
	}

	
	
	@Test (priority =1)
	public void loginpageTitle()
	{
		String title =loginpageuse.validdateLoginPagetitle();
		System.out.println("Page title"+title);
	}
	@Test (priority =2)
	public void loginuser() throws Exception
	{
		homepage = loginpageuse.loginuserandpassword(prop.getProperty("email"), prop.getProperty("password"));
		
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
		
	}
	
}
