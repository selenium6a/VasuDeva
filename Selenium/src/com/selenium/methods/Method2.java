package com.selenium.methods;

public class Method2 
{

	//method with return-type with-out parameters
	
	public int  add()
	{
		int a=80;
		int b=60;
		int sum =a+b;
		return sum;
	}
	public static void main(String[] args) 
	{
		Method2 ns=new Method2();
		
		int res=ns.add();//calling a method with variable,it will return value
		System.out.println(res);

	}

}
