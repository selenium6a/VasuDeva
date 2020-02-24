package com.selenium.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest 
{

	public static void main(String[] args) 
	{
		/*FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		//handling html alerts
		
		driver.findElement(By.xpath(".//*[@id='popupBoxClose']")).click();
*/
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login")).click();
		
		Alert al=driver.switchTo().alert();
		
		System.out.println(al.getText());
		
		al.accept();//ok
	}

}
