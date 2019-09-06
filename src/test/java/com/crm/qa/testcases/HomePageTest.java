package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.TestBase;
import com.crm.qa.page.LoginPage;

public class HomePageTest extends TestBase {

	
	public LoginPage loginpageuse;
	public HomePageTest() throws Exception {
		super();
	
	}

	
	
	@BeforeMethod
	public void setup() throws Exception
	{
		
		initialization(); 
		loginpageuse = new LoginPage();
		loginpageuse.loginuserandpassword(prop.getProperty("email"), prop.getProperty("password"));
		
	}
}
