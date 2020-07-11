package com.syntax.class19;

public class Homework {
	// Create a method that will accept a String as a parameter and return a new
	// String that consist only of vowels. Method should be available inside the
	// class where it was declared and executed by calling it is name.
	
	private static String onlyVowels(String str) {
		return str.replaceAll("[^AaEeIiOoUu]", "");
	}
	
	public static void main(String[] args) {
		
		String str = "Infomation Technology";
		
		System.out.println(onlyVowels(str));
	}
}
