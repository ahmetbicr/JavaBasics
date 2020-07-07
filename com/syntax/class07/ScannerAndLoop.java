package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// We want to ask user's name 5 times
		// and print Good Afternoon _____ 5 times

		// Do while loop will run 5 times
		int i = 1;

		do {
			System.out.println("Please enter your name");
			String name = scan.nextLine();

			System.out.println("Good Afternoon " + name);
			i++;
		} while (i <= 5);

		// While loop will run 5 times
		int j = 1;

		while (j <= 5) {
			System.out.println("Please enter your name");
			String name = scan.nextLine();

			System.out.println("Good Afternoon " + name);
			j++;
		}

	}
}
