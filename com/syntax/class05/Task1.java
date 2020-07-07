package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		// Prompt the user to enter person heights in inches. Person should be
		// classified as one of the following:
		// short (under 60 inch)
		// medium(between 60 -72 inch)
		// tall (over 72 inch)

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your heights in inches");
		int inch = scan.nextInt();

		if (inch < 60) {
			System.out.println("Short");
		} else if (inch >= 60 && inch <= 72) {
			System.out.println("Medium");
		} else {
			System.out.println("Tall");
		}
	}
}
