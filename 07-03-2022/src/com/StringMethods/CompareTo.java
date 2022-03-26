package com.StringMethods;

public class CompareTo {
	
	public static void main(String[] args) 
	{
		
		String text1 = "Welcome";
		
		String text2 = "Welcome";
		
		String text3 = "Java";
		
		String text4 = "Programing";
		
		System.out.println(text1.compareTo(text2));
		
		System.out.println(text1.compareTo(text3));
		
		System.out.println(text1.compareTo(text4));
		
		System.out.println("=======================");
		
		System.out.println(text1.compareToIgnoreCase(text4));

	}

}
