package com.syntax.class07;

public class Homework2 {

	public static void main(String[] args) {
		// 1.Print numbers from 100 to 1
		int i = 100;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}

		System.out.println("-----------");

		int j = 100;
		do {
			System.out.println(j);
			j--;
		} while (j >= 1);

		System.out.println("-----------");

		for (int k = 100; k >= 1; k--) {
			System.out.println(k);
		}

	}
}
