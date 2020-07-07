package com.syntax.class11;

public class Homework6 {

	public static void main(String[] args) {

		// Create an array of cars : american, german, korean, italian. Then retrieve
		// all values from that array using 2 different loops

		String[] cars = { "Tesla", "Jeep", "Volkswagen", "BMW", "Kia", "Hyndai", "Ferrari", "Maserati" };

		System.out.println("----------1st Way----------");

		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println();

		System.out.println("----------2nd Way----------");
		for (String car : cars) {
			System.out.print(car + " ");
		}
		System.out.println();

	}
}
