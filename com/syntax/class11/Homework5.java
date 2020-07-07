package com.syntax.class11;

public class Homework5 {

	public static void main(String[] args) {

		// Create a 2D array of integer type with 3 rows and 4 columns and print all
		// values of the whole array.

		int[][] numbers = new int[3][4];

		numbers[0][0] = 823;
		numbers[0][1] = 8720;
		numbers[0][2] = -238;
		numbers[0][3] = 82;

		numbers[1][0] = 712;
		numbers[1][1] = 2335;
		numbers[1][2] = -234;
		numbers[1][3] = 8234;

		numbers[2][0] = 512;
		numbers[2][1] = -235;
		numbers[2][2] = 8329;
		numbers[2][3] = 0;

		for (int i = 0; i < numbers.length; i++) {

			System.out.print(i + 1 + ". array = ");

			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + "   ");
			}

			System.out.println();
		}
	}
}
