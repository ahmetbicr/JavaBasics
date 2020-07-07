package com.syntax.class06;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// HomeWork: Using scanner class create calculator. Allow user to enter 2
		// numbers and operator(+,-,*,/). Based on operator provide the result to user.

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the first number");
		double num1 = scan.nextInt();
		System.out.println("Please enter the second number");
		double num2 = scan.nextInt();

		System.out.println("Please enter the operator (+, -, *, /)");
		char operator = scan.next().charAt(0);

		double result = 0;

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("Invalid operator");
		}

		if (operator == '+' || operator == '-' || operator == '/' || operator == '*') {
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		}
	}
}
