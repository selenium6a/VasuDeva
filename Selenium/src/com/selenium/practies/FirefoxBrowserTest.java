package com.selenium.practies;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest
{

	public static void main(String[] args)
	
	{
		// Launching Firefox Browser & navigate to facebook
		
		FirefoxDriver  driver=new FirefoxDriver();
		
		//navigate to facebook
		
		driver.get("Http://facebook.com");

	}

}
