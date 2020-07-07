package com.syntax.class08;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		// Write a program to ask a user to enter item they want to buy and the price of
		// that item. Every time user enters money accumulate the amount and tell the
		// user how much is left to pay off. If user give more money program should
		// return a change. Whenever user a done with payments program should say
		// "Thank you for shopping!"

		Scanner scan = new Scanner(System.in);

		double money;
		double totalAmount = 0;
		double remainingBalance;
		double change;

		System.out.println("Please enter the item that you want to buy!");
		String item = scan.nextLine();

		System.out.println("Please enter the price:");
		double price = scan.nextDouble();

		do {
			System.out.println("Please give me the payment!");
			money = scan.nextDouble();
			totalAmount += money;
			if (totalAmount < price) {
				remainingBalance = price - totalAmount;
				System.out.println("You need to give " + remainingBalance + " more");
			} else if (totalAmount > price) {
				change = totalAmount - price;
				System.out.println("Here is your change: " + change);
			} else {
				System.out.println("Maan, you gave exactly what you owed me!");
			}
		} while (totalAmount < price);

		System.out.println("Thank you for shopping!");

	}
}
