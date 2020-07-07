package com.syntax.class15;

public class Task2 {

	// Create a String that should be combination of letters, numbers and special
	// characters. Find out how many alpha characters are there in the String.

	public static void main(String[] args) {

		// One of the INTERVIEW QUESTIONS

		String str = "ajsdnf9843@#$23uhasdf";

		int size = str.replaceAll("[^A-Za-z]", "").length();

		System.out.println(size);
	}
}
