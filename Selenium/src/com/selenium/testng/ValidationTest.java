package com.selenium.testng;

import org.testng.Assert;
import org.testng.annotations.Test;



public class ValidationTest
{
	@Test
	public void validation()
	{
		String data="Selenium Training";
		String data1="Selenium";
		
		/*if(data.equals(data1))
		{
			System.out.println("Both the strings are equal");
		}else
		{
			System.out.println("Both the strings are not equal");
		}*/
		
		//Assert.assertEquals(data, data1);
		Assert.assertEquals(12, 13);
	}
	
}
