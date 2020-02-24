package com.selenium.java;

import java.util.Scanner;

public class IfStatementTest 
{

	public static void main(String[] args) 
	{
		// TO check the given no is Even /Odd Number
		
		
		//reading the data from keyboard
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
	
		
		if(n%2==0)//true   & false
		{
			System.out.println("Even number");//if-block
		}else
		{
			System.out.println("Odd Number");//else-block
		}

	}

}
