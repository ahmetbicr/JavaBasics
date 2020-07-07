package com.syntax.class12;

public class Recap2DArray {

	public static void main(String[] args) {

		String[][] animals = {

				{ "Cat", "Dog", "Bird", "Hamster" }, // first array or 1st row
				{ "Tiger", "Children", "Bear" }, // second array or 2nd row
				{ "Salmon", "Shrimp", "Sea bass" } // third array or 3rd row
		};

		int howManyArrays = animals.length;
		System.out.println(howManyArrays);

		int element1Array = animals[1].length;
		System.out.println(element1Array);

		String element = animals[1][1];
		System.out.println(element);

		System.out.println("----------USIN FOR LOOP----------");

		// How to get all elements from 2D array

		for (int i = 0; i < animals.length; i++) { // loops over rows or 1d arrays
			for (int j = 0; j < animals[i].length; j++) {
				String animal = animals[i][j];
				System.out.print(animal + " ");
			}
			System.out.println();
		}

		System.out.println("----------USIN ENHANCED FOR LOOP----------");

		for (String[] array : animals) {

			for (String animal : array) {
				System.out.print(animal + " ");
			}
			System.out.println();
		}

	}
}
