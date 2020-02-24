package com.selenium.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
//identify the elements and store into webelement
	
	@FindBy(id="txtUsername")
	WebElement username;//page object
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement login;
	
	//method
	
	public void adminLogin()
	{
		username.sendKeys("Admin");
		password.sendKeys("Qedge123!@#");
		login.click();
	}
}
