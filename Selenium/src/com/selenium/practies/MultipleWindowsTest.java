package com.selenium.practies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//System.out.println(driver.getWindowHandle());
		
		Set<String> windows=driver.getWindowHandles();
		
		/*for (String child : windows) 
		{
			System.out.println(child);
		}*/
		
		
		/*Iterator<String> it=windows.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next().toString());
		}
		*/
		
		/*for (String child : windows) 
		{
			//give control to  the child windows 
			
			driver.switchTo().window(child);
			
			//capture the title of the windows
			//System.out.println(driver.getTitle());
			//close one by one window
			
			//driver.close();
			
			//closing all the child windows except "Croma"
			
			driver.switchTo().window(child);
			
			if (!driver.getTitle().equals("Croma"))
			{
				driver.close();
			}
		}*/
		
		List<String> tabs=new ArrayList(windows);
		
		driver.switchTo().window(tabs.get(0));
		
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(tabs.get(1));
		
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(tabs.get(2));
		
		System.out.println(driver.getTitle());
		driver.close();
	}

}
