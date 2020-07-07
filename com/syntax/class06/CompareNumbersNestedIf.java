package com.syntax.class06;

import java.util.Scanner;

public class CompareNumbersNestedIf {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number");
		double num1 = scan.nextDouble();
		System.out.println("Enter the second number");
		double num2 = scan.nextDouble();
		System.out.println("Enter the third number");
		double num3 = scan.nextDouble();

		double largest;

		if (num1 > num2) {
			// here a is already larger than b
			if (num1 > num3) {
				// a is the largest
				largest = num1;
			} else {
				// a is larger than b, but c is larger than a
				largest = num3;
			}
		} else {
			// here b is already larger than a
			if (num2 > num3) {
				// b is the largest
				largest = num2;
			} else {
				// b is larger than a, but c is larger than b
				largest = num3;
			}
		}

		System.out.println("Largest number is " + largest);
	}
}
