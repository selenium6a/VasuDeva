package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//day
		
		Select day=new Select(driver.findElement(By.id("day")));
		
		day.selectByIndex(5);
		
		//month
		
		Select month=new Select(driver.findElement(By.id("month")));
		
		month.selectByIndex(6);
		
		//year
		
		Select year=new Select(driver.findElement(By.id("year")));
		
		year.selectByIndex(8);

	}

}
