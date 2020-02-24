package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.navigate().to("Http://Amazon.in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("VasuDeva");

	}

}
