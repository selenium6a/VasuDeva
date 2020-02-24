package com.selenium.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest 
{

	public static void main(String[] args)
	{
	
		//ArrayList<String> l=new ArrayList<>();
		/*List<String> l=new ArrayList<>();
		
		l.add("Vasu");
		l.add("Selenium");
		l.add("Qtp");
		
		l.add("Selenium");
		l.add("Vasu");
		
		System.out.println(l.size());
		
		for (int i = 0; i < l.size(); i++) 
		{
			System.out.println(l.get(i));
		}
		
		for (String item : l) 
		{
		System.out.println(item);	
		}*/
		
		/*List<Integer> l=new ArrayList<>();
		
		l.add(45);
		l.add(23);
		
		System.out.println(l.size());
		
		for (int i = 0; i < l.size(); i++) 
		{
			System.out.println(l.get(i));
		}
		
		for (int item : l) 
		{
		System.out.println(item);	
		}*/
		List<Object> l=new ArrayList<>();
		
		l.add("Vasu");
		l.add(123);
		l.add(12.67);
		
		l.add('C');
		l.add("Vasu");
		
		
		System.out.println(l.size());
		
		/*for (int i = 0; i < l.size(); i++) 
		{
			System.out.println(l.get(i));
		}*/
		
		for (Object item : l) 
		{
		System.out.println(item);	
		}
	}

}
