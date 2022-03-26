package com.StringMethods;

public class StartsWith {

	public static void main(String[] args) {
		
		String message = "Hello How are you, I am fine, thank you";
		
		System.out.println(message.startsWith("Hello"));
		
		System.out.println(message.startsWith("are"));
		
		System.out.println(message.startsWith("How are you"));
		
		System.out.println(message.startsWith("Hello How are you"));
		
		System.out.println(message.startsWith("H"));

	}

}
