package com.selenium.java;

public class StringValidation 
{

	public static void main(String[] args) 
	{
		/*String data="Selenium Training";
		String data1="Selenium";
		
		if(data.equals(data1))
		{
			System.out.println("Both the strings are equal");
		}else
		{
			System.out.println("Both the strings are not equal");
		}
*/
		String data="Selenium Training";
		String data1="VasuDeva";
		
		if(data.contains(data1))
		{
			System.out.println("Exist");
		}else
		{
			System.out.println("Not Exist");
		}

	}

}
