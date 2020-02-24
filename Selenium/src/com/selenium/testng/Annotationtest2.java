package com.selenium.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationtest2
{
	
	@Test
	public void method1()
	{
		System.out.println("Method1 Executed");
	}
	
	@Test
	public void method2()
	{
		System.out.println("Method2 Executed");
	}

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest Executed");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest Executed");
	}
}
