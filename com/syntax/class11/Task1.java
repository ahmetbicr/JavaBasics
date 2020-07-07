package com.syntax.class11;

public class Task1 {

	public static void main(String[] args) {

		// Create an array of cars and store 6 elements into it. Print all values from
		// the array.

		String[] cars = new String[6];
		cars[0] = "Toyota";
		cars[1] = "BMW";
		cars[2] = "Acura";
		cars[3] = "Honda";
		cars[4] = "Lexus";
		cars[5] = "Land Rover";

		for (String car : cars) {
			System.out.println(car);
		}
	}
}
