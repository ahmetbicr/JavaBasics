package com.syntax.class11;

public class RetrievingValuesFromTwoArrays {

	public static void main(String[] args) {
		// Put the months for each season in one row

		String[][] months = { { "December", "January", "February" }, { "March", "April", "May" },
				{ "June", "July", "August" }, { "September", "October", "November" } };

		int seasons = months.length; // How many arrays are inside, how many rows?
		System.out.println(seasons + " seasons / rows");

		int winterLength = months[0].length; // How many elements / columns are in row with index 0
		System.out.println(winterLength + " months are in winter / row index 0");

		// Nested loops are married to 2D arrays
		for (int i = 0; i < months.length; i++) { // iterating over rows
			for (int j = 0; j < months[i].length; j++) { // iterating over columns
				System.out.print(months[i][j] + " ");
			}
			System.out.println();
		}
	}
}
