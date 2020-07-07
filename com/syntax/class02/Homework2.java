package com.syntax.class02;

public class Homework2 {

	public static void main(String[] args) {

		// Write a Java program to add, subtract, multiply and divide 2 decimal values.
		// Your program should say. "The _______ of 2 numbers ___ and ___ is equal to
		// _____"

		double num1 = 5.7;
		double num2 = 4.45;

		String sSum = "addition";
		String sSub = "subtraction";
		String sMult = "multiplacation";
		String sDiv = "division";

		double dSum = num1 + num2;
		double dSub = num1 - num2;
		double dMult = num1 * num2;
		double dDiv = num1 / num2;

		System.out.println("The " + sSum + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + dSum);
		System.out.println("The " + sSub + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + dSub);
		System.out.println("The " + sMult + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + dMult);
		System.out.println("The " + sDiv + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + dDiv);

		System.out.println();
		System.out.println("============================================");
		System.out.println();

		// Write a program to find the square of the number 3.9. You program should say
		// "The square of the ____ is ____ "

		double num3 = 3.9;
		double num3Square = num3 * num3;
		System.out.println("The square of the " + num3 + " is " + num3Square);

		System.out.println();
		System.out.println("============================================");
		System.out.println();

		// Write a program to print the area and perimeter of a rectangle with width = 5
		// and height = 8. Your program should say. "The perimeter of a rectangle with
		// width ___ and height ____ is equal to _____ and the area is __"

		int width = 5;
		int height = 8;
		int area = width * height;
		int perimeter = 2 * (width + height);
		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height
				+ " is equal to " + perimeter + " and the area is " + area);

	}
}
