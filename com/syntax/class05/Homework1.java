package com.syntax.class05;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// Write a program to find largest of
		// three double values using if-else..if and logical operators provided by a
		// user (numbers must be distinct)

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number");
		double num1 = scan.nextDouble();
		System.out.println("Enter the second number");
		double num2 = scan.nextDouble();
		System.out.println("Enter the third number");
		double num3 = scan.nextDouble();

		double max;

		if (num1 > num2 && num1 > num3) {
			max = num1;
		} else if (num2 > num3) {
			max = num2;
		} else {
			max = num3;
		}

		System.out.println("The biggest number is " + max);

		System.out.println("----------------------------------");
		// Write a program to find largest
		// number among three numbers using nested if provided by a user (numbers must
		// be distinct)

		System.out.println("Enter the first number");
		double num4 = scan.nextDouble();
		System.out.println("Enter the second number");
		double num5 = scan.nextDouble();
		System.out.println("Enter the third number");
		double num6 = scan.nextDouble();
		double largest;

		if (num4 > num5) {
			if (num4 > num6) {
				largest = num4;
			} else {
				largest = num6;
			}
		} else {
			if (num5 > num6) {
				largest = num5;
			} else {
				largest = num6;
			}
		}

		System.out.println("The biggest number is " + largest);
	}
}
