package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("u_0_6")).click();
		
		/*WebElement radio=driver.findElement(By.id("u_0_z"));
		
		List<WebElement> radioList=radio.findElements(By.tagName("input"));
		
		System.out.println(radioList.size());
		
		for (int i = 0; i < radioList.size(); i++) 
		{
			radioList.get(i).click();
			//validation
			for (int j = 0; j < radioList.size(); j++)
			{
				radioList.get(j).getAttribute("checked");
			}
			System.out.println("##########");
			
		}*/
		
		//capture names
		
		WebElement radio=driver.findElement(By.id("u_0_z"));
		
		List<WebElement> radioList=radio.findElements(By.tagName("label"));
		
		System.out.println(radioList.size());
		
		for (int i = 0; i < radioList.size(); i++)
		{
			System.out.println(radioList.get(i).getText());
		}

	}

}
