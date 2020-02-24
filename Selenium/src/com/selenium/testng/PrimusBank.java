package com.selenium.testng;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class PrimusBank 
{

	FirefoxDriver driver;
	@BeforeSuite
	public void appLaunch()
	{
	    driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		//validation
		Assert.assertTrue(driver.findElement(By.id("txtuId")).isDisplayed());
		
	}
	@BeforeTest
	public void appLogin()
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
	}
	
	@AfterTest
	public void appLogout() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		//validation
	}
	
	@AfterSuite
	public void appClose()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
}
