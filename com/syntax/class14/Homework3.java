package com.syntax.class14;

public class Homework3 {

	/*
	 * Create a String and print it in reverse order (Sunday → yadnuS). INTERVIEW
	 * QUESTION
	 */

	public static void main(String[] args) {

		String day = "Sunday";

		String newString = "";

		for (int i = day.length() - 1; i >= 0; i--) {
			char letters = day.charAt(i);
			newString = newString + letters;
			// newString += letters;
		}

		System.out.println(newString);
		
		
	}
}
