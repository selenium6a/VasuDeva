package com.selenium.testng;

import org.testng.annotations.Test;

public class MultipleTestCases 
{

	
	@Test(priority=1)
	public void appLaunch()
	{
		System.out.println("appLaunch");
	}
	
	
	@Test()
	public void appLogin()
	{
		System.out.println("appLogin");
	}
	@Test()
	public void appClose()
	{
		System.out.println("appClose");
	}
	
}
