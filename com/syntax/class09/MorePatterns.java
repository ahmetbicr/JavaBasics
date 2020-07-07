package com.syntax.class09;

public class MorePatterns {

	public static void main(String[] args) {
		// 12345
		// 12345
		// 12345

		// How many rows? --> 3
		for (int i = 1; i <= 3; i++) {
			// How many columns? --> 5
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("------------");

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
