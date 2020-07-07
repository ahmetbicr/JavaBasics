package com.syntax.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		// We have 7 days of week
		// if day is 2,4 --> SDLC class
		// if day is 6,7 --> JAVA class
		// if day is 1,5 --> No class
		// if day is 3 --> Review class

		int day = 6;

		if (day == 2 || day == 4) {
			System.out.println("SDLC class");
		} else if (day == 6 || day == 7) {
			System.out.println("JAVA class");
		} else if (day == 1 || day == 5) {
			System.out.println("No class");
		} else if (day == 3) {
			System.out.println("Review class");
		} else {
			System.out.println("Invalid day");
		}
	}
}
