package com.syntax.class09;

public class Homework1 {

	public static void main(String[] args) {
		// Print the following pattern:
		// 54321
		// 54321
		// 54321
		// 54321

		for (int i = 1; i <= 4; i++) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
