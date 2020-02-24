package com.selenium.practies;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTest 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//closes the current activated window
		//driver.close();
		//closes all the windows open by the webdriver
		
		//driver.quit();
		
		
		System.out.println(driver.getPageSource());

	}

}
