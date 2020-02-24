package com.selenium.java;

public class Vasu 
{

	//variables
	
	int i=4;
	
	//methods
	
	public  void  add()
	{
		
		//Program to perform addition of two numbers
		
				int a=20;
				
				int b=30;
				
				int sum=a+b;
				
				System.out.println(sum);
	}
	
	
	
	
	public static void main(String[] args) 
	{
		// Object
		
		Vasu v=new Vasu();
		
		v.add();//method
		System.out.println(v.i);//variable

	}

}
