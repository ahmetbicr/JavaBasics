package com.syntax.class12;

public class Task {

	public static void main(String[] args) {
		// create a 2D that will store food of different kinds
		// and retrieve all values from that array using 2 different loops

		String[][] foods = { { "Lahmacun", "Kebap", "Doner" }, // 1st row
				{ "Butter chicken", "Rasmalai" }

		};

		System.out.println("----------1st Way----------");

		for (int i = 0; i < foods.length; i++) {
			for (int j = 0; j < foods[i].length; j++) {
				System.out.print(foods[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("----------2nd Way----------");

		for (String[] array : foods) {
			for (String food : array) {
				System.out.print(food + " ");
			}
			System.out.println();
		}

		System.out.println("----------OTHER TASK----------");
		// Let's create an 2D array of int and calculate sum of all odd numbers

		int[][] numbers = { { 10, 23, 56, 47 }, // 1st row
				{ 33, 668, 89 }, // 2nd row
				{ 1, 9, 0 }// 3rd row
		};

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] % 2 == 1) {
					sum += numbers[i][j];
				}
			}
		}

		System.out.println("Sum of the all odd numbers: " + sum);

		System.out.println("----------2nd Way----------");

		int total = 0;

		for (int[] array : numbers) {
			for (int number : array) {
				if (number % 2 == 0) {
					total += number;
				}
			}
		}
		System.out.println("Sum of the all even numbers: " + total);

	}
}
