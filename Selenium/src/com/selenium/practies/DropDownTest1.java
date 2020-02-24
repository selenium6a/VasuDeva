package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTest1 {

	public static void main(String[] args) throws Exception
	{

		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("src")).sendKeys("H");
		
		Thread.sleep(2000);
		
		List<WebElement> dropList=driver.findElements(By.xpath("//*[@id='search']/div/div[1]/div/ul/li"));
		System.out.println(dropList.size());
		
		for (int i = 0; i < dropList.size(); i++) 
		{
			System.out.println(dropList.get(i).getText());
			/*//dropList.get(i).click();
			
			if(dropList.get(i).getText().equals("Baby"))
			{
				dropList.get(i).click();
			}*/
		}

	}

}
