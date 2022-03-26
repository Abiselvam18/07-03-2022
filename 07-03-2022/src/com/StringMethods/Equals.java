package com.StringMethods;

public class Equals {

	public static void main(String[] args) {
		
		String text1 = "Welcome";
		
		String text2 = "Welcome";
		
		String text3 = "Java";
		
		String text4 = "String";

		System.out.println(text1.equals(text2));
		System.out.println(text1.equals(text3));
		System.out.println(text1.equals(text4));
		
		System.out.println("==========================");
		
		System.out.println(text1.equalsIgnoreCase(text4));

	}

}
