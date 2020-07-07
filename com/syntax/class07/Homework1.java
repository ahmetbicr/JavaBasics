package com.syntax.class07;

public class Homework1 {

	public static void main(String[] args) {
		// 1.Print numbers from 1 to 100 in 1 line with space
		int i = 1;
		while (i < 100) {
			System.out.print(i + " ");
			i++;
		}

		System.out.println();
		System.out.println("----------------");

		int j = 1;
		do {
			System.out.print(j + " ");
			j++;
		} while (j < 100);

		System.out.println();
		System.out.println("----------------");

		for (int k = 1; k < 100; k++) {
			System.out.print(k + " ");
		}

	}
}
