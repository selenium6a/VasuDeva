package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLoginTest 
{

	public static void main(String[] args) 
	{
		
		/*String username;
		username="Admin";*/
		
		String username="Admin";
		String password="Admin";
		String expTitle="Primus BANK";
		//appLaunch
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		String actTitle=driver.getTitle();
		//validation
		if(expTitle.equals(actTitle))
		{
			System.out.println("AppLaunch Successfully");
		}else
		{
			System.out.println("AppLaunch Failed");
		}
		
		//appLogin
		
		driver.findElement(By.id("txtuId")).sendKeys(username);
		driver.findElement(By.id("txtPword")).sendKeys(password);
		driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
		
		//validation
		
		if (driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed()) 
		{
			System.out.println("AppLogin Successfully");
		}else
		{
			System.out.println("AppLogin Failed");
		}
		
		//appLogout
		
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		
		//validation
		
		if (driver.findElement(By.id("txtuId")).isDisplayed())//true
		{
			System.out.println("AppLogout Sucessfully");
		}else
		{
			System.out.println("AppLogout Failed");
		}
		//appClose
		
		driver.close();
		

	}

}
