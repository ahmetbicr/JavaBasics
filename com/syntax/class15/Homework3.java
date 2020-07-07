package com.syntax.class15;

import java.util.Scanner;

public class Homework3 {

//	How would you check if String is palindrome or not?

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();

		str = str.replace(" ", "");

		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}

		System.out.println("Reversed: " + reverse);

		if (reverse.equalsIgnoreCase(str)) {
			System.out.println("This string is palindrome");
		} else {
			System.err.println("This string is NOT palindrome");
		}
	}
}
