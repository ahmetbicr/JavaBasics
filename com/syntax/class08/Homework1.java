package com.syntax.class08;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// Write a program that reads a range of integers (start and end point),
		// provided by a user and then from that range prints the sum of the even and
		// odd integers.

		Scanner scan = new Scanner(System.in);

		int start, end;

		System.out.println("Please enter the start point");
		start = scan.nextInt();
		System.out.println("Please enter the end point");
		end = scan.nextInt();
		int sumOdd = 0;
		int sumEven = 0;
		int total = 0;

		for (int i = start; i <= end; i++) {
			if (i % 2 == 1) {
				sumOdd += i;
			} else {
				sumEven += i;
			}

//			// 1st way
//			total += i;

			// 2nd way
			total = sumOdd + sumEven;
		}

		System.out.println("The sum of odd numbers: " + sumOdd);
		System.out.println("The sum of even numbers: " + sumEven);
		System.out.println("The sum of all numbers: " + total);

	}
}
