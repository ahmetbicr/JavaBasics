package com.syntax.class11;

public class Largest {

	public static void main(String[] args) {

		// Find the largest number in array

		int[] numbers = { -23, -56, -73, -16, -80, -70, -39 };

		int max = numbers[0];
		for (int number : numbers) {
			if (max < number) {
				max = number;
			}
		}
		System.out.println(max);
	}
}
