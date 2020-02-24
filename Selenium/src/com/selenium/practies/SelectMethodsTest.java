package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodsTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://amazon.in/");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		Select sl=new Select(drop);
		
		//sl.selectByIndex(5);
		//sl.selectByVisibleText("Books");
		sl.selectByValue("search-alias=automotive");
		
		/*List<WebElement> dropList=sl.getOptions();
		System.out.println(dropList.size());
		for (int i = 0; i < dropList.size(); i++)
		{
		System.out.println(dropList.get(i).getText());	
		}*/
		
		//System.out.println(sl.getFirstSelectedOption().getText());
		//System.out.println(sl.isMultiple());//true/false
		
		List<WebElement> selectedItems=sl.getAllSelectedOptions();
		
		System.out.println(selectedItems.size());
		
		for (int i = 0; i < selectedItems.size(); i++)
		{
			System.out.println(selectedItems.get(i).getText());
		}
		
	}

}
