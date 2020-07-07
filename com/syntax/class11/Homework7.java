package com.syntax.class11;

public class Homework7 {

	public static void main(String[] args) {

		// Create an array of countries: north america countries, south america
		// countries, europe countries, asian countries, african countries. Then print
		// all values from that array using 2 different loops and calculate how many
		// total countries been stored.

		String[] countries = { "USA", "Canada", "Brazil", "Argentina", "Germany", "Italy", "Japan", "Turkey", "Nigeria",
				"Kenya" };

		System.out.println("----------2nd Way----------");
		int howMany = countries.length;

		for (int i = 0; i < countries.length; i++) {
			System.out.print(countries[i] + " ");
		}
		System.out.println();
		System.out.println("There are " + howMany + " countries in that array.");

		System.out.println("----------2nd Way----------");

		int count = countries.length;

		for (String country : countries) {
			System.out.print(country + " ");
		}
		System.out.println();
		System.out.println("There are " + count + " countries in that array.");
	}
}
