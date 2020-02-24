package com.selenium.methods;

public class NSMethods 
{
//method with return-type with parameters
	
	
	public int  add(int a,int b)
	{
		int sum=a+b;
		
		return sum;
	}
	
	public static void main(String[] args) 
	{
		NSMethods ns=new NSMethods();
		
		//ns.add(20, 40);//calling a method with method name ,it won't return a value
		int res=ns.add(20, 40);//calling a method with variable ,it will return a value
		System.out.println(res);
	}
}
