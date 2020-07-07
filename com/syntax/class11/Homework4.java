package com.syntax.class11;

public class Homework4 {

	public static void main(String[] args) {

		// Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
		// Print the sum of all numbers.

		int[][] numbers = new int[3][3];

		numbers[0][0] = 9523;
		numbers[0][1] = 832;
		numbers[0][2] = -234;

		numbers[1][0] = 273;
		numbers[1][1] = -3832;
		numbers[1][2] = -23526;

		numbers[2][0] = -2837;
		numbers[2][1] = 23472;
		numbers[2][2] = -999;

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {

				sum += numbers[i][j];
			}
		}

		System.out.println("Sum of the numbers: " + sum);
	}
}
