package com.syntax.class05;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
//		Write a program for user to enter his/hers birth month. Based on the month define the season.
//		Example: if user is born in June, July or August → season ="Summer".
//		At the end of the program we should see output as "You were born ______".

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your birth month");
		String month = scan.nextLine();

		String season;

		if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("Januarry")
				|| month.equalsIgnoreCase("February")) {
			season = "Winter";
			System.out.println("You were born " + season);
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
				|| month.equalsIgnoreCase("May")) {
			season = "Spring";
			System.out.println("You were born " + season);
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
				|| month.equalsIgnoreCase("August")) {
			season = "Summer";
			System.out.println("You were born " + season);
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
				|| month.equalsIgnoreCase("November")) {
			season = "Autumn";
			System.out.println("You were born " + season);
		} else {
			System.out.println("Invalid month");
		}
	}
}
