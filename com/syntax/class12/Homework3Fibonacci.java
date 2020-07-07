package com.syntax.class12;

public class Homework3Fibonacci {

	// Write a Java Program to print the first 10 numbers of Fibonacci series.

	public static void main(String[] args) {

		// 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 , 55 ....

//		int[] numbers = new int[10];
//
//		int number = 1;
//		for (int i = 0; i < numbers.length; i++) {
//			if (i == 0) {
//				numbers[i] = number;
//			} else if (i == 1) {
//				numbers[i] = number;
//			} else {
//				number = numbers[i - 2] + numbers[i - 1];
//				numbers[i] = number;
//			}
//
//		}
//
//		for (int Fibonacci : numbers) {
//			System.out.print(Fibonacci + ", ");
//		}

//		int num1 = 0;
//		int num2 = 1;
//		int sum = 0;
//
//		for (int i = 0; i < numbers.length; i++) {
//			numbers[i] = num1;
//			sum = num1 + num2;
//			num1 = num2;
//			num2 = sum;
//		}
//
//		for (int number : numbers) {
//			System.out.println(number);
//		}

		int num1 = 0;
		int num2 = 1;
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print(num1 + " ");
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;

		}
	}
}
