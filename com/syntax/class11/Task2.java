package com.syntax.class11;

public class Task2 {

	public static void main(String[] args) {

		// Create an array of integers and calculate the sum of all elements in an array

		int[] numbers = { 100, 50, 324, -238, 585, 392 };

		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}

		System.out.println("The sum of all numbers is: " + sum);

		System.out.println("-----USING FOR LOOP------");

		int total = 0;
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}

		System.out.println("The total of all numbers is: " + total);
	}
}
