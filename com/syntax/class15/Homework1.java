package com.syntax.class15;

public class Homework1 {

//		How would you reverse a String character by character?

	public static void main(String[] args) {

		String str = "I love java";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
