package com.syntax.class09;

public class Homework4 {

	public static void main(String[] args) {

		// Print the following pattern:
		// 55555
		// 4444
		// 333
		// 22
		// 1

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
