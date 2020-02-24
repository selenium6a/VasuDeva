package com.selenium.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameterization 
{

	@Test(dataProvider="getData")
	public void adminLogin(String username,String password)
	{
		System.out.println("UserName is : "+username);
		System.out.println("Password is : "+password);
	}

	
	@DataProvider
	
	public Object[][] getData()
	{
		Object [][] data=new Object[2][2];
		
		data[0][0]="Vasudeva";
		data[0][1]="Qedge";
		data[1][0]="madhuri";
		data[1][1]="prathyusa";
		return data;
	}
}
