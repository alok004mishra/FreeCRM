package com.crm.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Homepage extends TestBase {

	@FindBy(xpath="//span[contains(text(), 'Alok Mishra')]")
	WebElement usernamelabel;
	
	@FindBy(xpath="//span[contains(text(), 'Contacts')]")
	WebElement contacts;
	
	
	@FindBy(xpath=" //span[contains(text(), 'Calendar')]")
	WebElement calendar;
	

	
	public Homepage() throws Exception {
		
		
		
		super();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	public String verifyhometitle()
	{
		
		return driver.getTitle();
	}
	
	public ContentPage ClickonContacts()
	{
		contacts.click();
		
		return new  ContentPage();
		
	}
	

}
