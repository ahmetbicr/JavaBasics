package com.syntax.class04;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		// Create a Java program that will ask if user has a credit card or not.
		// If you user does not have a credit card then offer them. If they do have one
		// ask what is balance on the card? If balance of the card is larger than 1000,
		// tell them to pay off immediately, otherwise you can tell them that they can
		// spend more.

		Scanner scan = new Scanner(System.in);

		System.out.println("Do you have credit card? Please type as True or False");
		boolean creditCard = scan.nextBoolean();

		if (!creditCard) {
			System.out.println("Congratulations. You have new offers about credit card!");
		} else {
			System.out.println("Please enter your balance!");
			int balance = scan.nextInt();
			if (balance > 1000) {
				System.out.println("Please pay off immediately");
			} else {
				System.out.println("You can spend more");
			}
		}
	}
}
