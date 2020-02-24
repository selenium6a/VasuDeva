package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTest 
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		//frames count
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
				
		System.out.println(frames.size());
		
		driver.switchTo().frame(0);
		
		WebElement sl=driver.findElement(By.xpath(".//*[@id='slider']/span"));
		
		Actions slider=new Actions(driver);
		
		slider.clickAndHold(sl).moveByOffset(150, 0).release(sl).perform();
		Thread.sleep(2000);
		slider.clickAndHold(sl).moveByOffset(-150, 0).release(sl).perform();		

	}

}
