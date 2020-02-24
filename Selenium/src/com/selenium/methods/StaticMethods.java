package com.selenium.methods;

public class StaticMethods
{

	//static method with return-type with parameters
	
	
		public static int  add(int a,int b)
		{
			int sum=a+b;
			
			return sum;
		}
		
		public static void main(String[] args) 
		{
			//calling static methods ,no need to create object ref
			//syntax--> classname.methodname
			
			//StaticMethods.add(20, 5);//calling with methodname
			
			int res=StaticMethods.add(50, 45);//calling with variable
			System.out.println(res);
		}

}
