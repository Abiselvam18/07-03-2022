package com.StringMethods;

public class Trim {

	public static void main(String[] args) {
		
		String message = " Hai, How are you, I am fine. ";
		
		System.out.println(message.length());
		System.out.println(message);
		
		System.out.println("===================");
		
		String text = message.trim();//trim() used
		
		System.out.println(text.length());
		System.out.println(text);
	}

}
