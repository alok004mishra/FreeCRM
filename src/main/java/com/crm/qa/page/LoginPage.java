package com.crm.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	
	// page Factory :- OR
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath= "//div[@class='ui fluid large blue submit button']")
	WebElement login;
	
	
	//Instialization the page Object
	
	public LoginPage() throws Exception
	
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String validdateLoginPagetitle()
	{
		return driver.getTitle();
	}
	
	
	public Homepage loginuserandpassword(String un, String pwd) throws Exception
	{
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		System.out.println("User login to the page");
		Thread.sleep(5000);
		
		return  new Homepage(); 
	}
}
