package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest1 {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		driver.manage().window().maximize();
		
		//capture all the links By using tagName and store into webElement
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (WebElement element : links) 
		{
			//System.out.println(element.getText());
			
			if (element.getText().equals("New User Register")) 
			{
				element.click();
			}
		}

	}

}
