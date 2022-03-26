package com.StringMethods;

public class Getbytes {

	public static void main(String[] args) {
		
		String text = "Welcome to String";
		
		byte b1[] = text.getBytes();
		
		for(byte b: b1)
		{
			System.out.println(b);
		}

	}

}
