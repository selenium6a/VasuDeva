package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("nav-link-accountList")).click();
		
		//WebElement signIn=driver.findElement(By.id("nav-link-accountList"));
		WebElement ywl=driver.findElement(By.xpath(".//*[@id='nav-al-your-account']/a[4]/span"));

		
		Actions mouse=new Actions(driver);
		
		//mouse.moveToElement(signIn).click().perform();
		
		mouse.moveToElement(ywl).click().perform();
	}

}
