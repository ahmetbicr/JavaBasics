package com.syntax.class11;

public class Homework3 {

	public static void main(String[] args) {

		// Create a 2D array or integer type where you will store odd and even numbers
		// in 3 rows and 4 columns. Develop a program which will identify/print the even
		// numbers only.

		int[][] numbers = new int[3][4];

		numbers[0][0] = 412;
		numbers[0][1] = 419;
		numbers[0][2] = 482;
		numbers[0][3] = 403;

		numbers[1][0] = -241;
		numbers[1][1] = -293;
		numbers[1][2] = -299;
		numbers[1][3] = -202;

		numbers[2][0] = 999;
		numbers[2][1] = 908;
		numbers[2][2] = 900;
		numbers[2][3] = 10004124;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {

				if (numbers[i][j] % 2 == 0) {
					System.out.println(numbers[i][j]);
				}

			}
		}

	}
}
