package com.syntax.class14;

import java.util.Scanner;

public class Homework1 {

	/*
	 * Write a program that reads two people's first names and if they expecting boy
	 * or girl? Based on the input suggests a name for a baby: Example Output: Mom’s
	 * first name? Mary Dad’s first name? Daniel Boy or Girl? boy Suggested baby
	 * name: DANRY
	 * 
	 * Example Output: Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl?
	 * girl Suggested baby name: MAIEL
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Dady's name: ");
		String dad = scan.next();
		System.out.print("Mom's name: ");
		String mom = scan.next();

		System.out.println("What is the baby's gender: (boy or girl)");
		String baby = scan.next();

		String babyName;

		// Boy --> boy .equals("boy")
		if (baby.toLowerCase().equals("boy")) {
			System.out.println("Congratulations, It is a boy!");
			babyName = dad.substring(0, dad.length() / 2) + mom.substring(mom.length() / 2);

		} else if (baby.equalsIgnoreCase("girl")) {
			System.out.println("Congratulations, It is a boy!");
			babyName = mom.substring(0, mom.length() / 2) + dad.substring(dad.length() / 2);

		} else {

			babyName = "unknown";
		}

		System.out.println("Suggested baby name: " + babyName.toUpperCase());

		scan.close();

		String day = "Sunday";
		// String --> char --> sorry cannot call String method because you are not a
		// String
		// day.charAt()1.toUpperCase();
		// String --> String --> char
		char letter = day.toUpperCase().charAt(1);

		int lengthOfNewDay = day.substring(3).toUpperCase().length(); // 3
		System.out.println(lengthOfNewDay);
	}
}
