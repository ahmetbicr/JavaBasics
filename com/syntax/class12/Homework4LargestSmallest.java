package com.syntax.class12;

public class Homework4LargestSmallest {

	// Write a java program to find the second largest number in the array? Maximum
	// and minimum number in the array?

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 29, 50, 39, 91, 70 };

		int max = numbers[0];
		int min = numbers[0];
		int secondLargest = numbers[0];

		for (int number : numbers) {
			if (number > max) {
				max = number;
			}
			if (number < min) {
				min = number;
			}
			if (number > secondLargest && max > number) {
				secondLargest = number;
			}
		}

		System.out.println(min);
		System.out.println(max);
		System.out.println(secondLargest);
	}
}
