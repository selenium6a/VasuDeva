package com.selenium.java;

public class ForLoopTest 
{

	public static void main(String[] args)
	{
		// TO Display "Selenium" Message 20 times in console
		
		/*for (int i = 1; i <=20; i++) 
		{
			System.out.println(i+"   "+"Selenium");
		}*/
		
		
		for (int i = 1; i <=10; i++) 
		{
			
			for (int j = 1; j <=10; j++) 
			{
				System.out.println(i+"  x  "+j+"  =  "+i*j);
			}
			
		}

	}

}
