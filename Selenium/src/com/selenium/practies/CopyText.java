package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CopyText {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/advanced_search");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("xX4UFf")).sendKeys("VasuDeva");
		//select the text
		driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"a");
		//copy the text
		driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"c");
		//paste the text
		driver.findElement(By.id("mSoczb")).sendKeys(Keys.CONTROL+"v");
		
		
		

	}

}
