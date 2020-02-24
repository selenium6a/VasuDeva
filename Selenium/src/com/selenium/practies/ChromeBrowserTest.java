package com.selenium.practies;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("Http://Amazon.in");

	}

}
