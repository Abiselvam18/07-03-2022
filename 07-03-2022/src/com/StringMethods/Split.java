package com.StringMethods;

public class Split {

	public static void main(String[] args) {

		String message = "Hello How are, I am fine, thank you";
		
		String words[] = message.split("\\s");
		
		for(String word: words)
		{
			System.out.println(word);
		}
	}
}
