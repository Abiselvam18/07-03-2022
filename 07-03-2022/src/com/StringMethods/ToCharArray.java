package com.StringMethods;

public class ToCharArray {

	public static void main(String[] args) {
		
		String message = "Hello How are, I am fine, thank you";
		
		char characters[] = message.toCharArray();
		
		for(char character: characters)
		{
			System.out.println(character);
		}

	}

}
