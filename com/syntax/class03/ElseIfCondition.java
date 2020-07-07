package com.syntax.class03;

public class ElseIfCondition {

	public static void main(String[] args) {
		double num1 = 10.7;
		double num2 = 10.5;

		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + " is smaller than " + num2);
		} else if (num1 == num2) {
			System.out.println(num1 + " and " + num2 + " are equal");
		} else {
			System.out.println("You will never come here!");
		}

		System.out.println("We are done.");

		System.out.println("---------------------");

		// If it is none of them (example when day = 10)
		// print "invalid day"

		int day = 7;

		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Invalid day");
		}

		System.out.println("End of Program");

		String name = 38 + 2 + "John" + true;

		System.out.println(name);
	}
}
