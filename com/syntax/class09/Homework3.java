package com.syntax.class09;

public class Homework3 {

	public static void main(String[] args) {

		// Print the following pattern:
		// *
		// **
		// ***
		// ****
		// *****

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
