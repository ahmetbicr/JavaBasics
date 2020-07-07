package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Ask user to enter their country and capture it. Once values are captured
		// print which language user speaks.

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your country");
		String country = scan.next();
		String language;

		switch (country) {
		case "Turkey":
			language = "Turkish";
			break;
		case "America":
		case "England":
			language = "English";
			break;
		case "Spain":
			language = "Spanish";
			break;
		case "Albany":
			language = "Albanian";
			break;
		default:
			language = "Unknown";
		}

		System.out.println("Your language is " + language);
	}
}
