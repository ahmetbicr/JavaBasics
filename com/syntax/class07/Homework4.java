package com.syntax.class07;

public class Homework4 {

	public static void main(String[] args) {
		// 1.Print odd numbers between 20 and 50 (2 ways)

		// ----------1ST WAY----------
		System.out.println("------WHILE 1ST WAY------");
		int i = 20;
		while (i <= 50) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}

		System.out.println("------DO WHILE 1ST WAY------");
		int j = 20;
		do {
			if (j % 2 != 0) {
				System.out.println(j);
			}
			j++;
		} while (j <= 50);

		System.out.println("------FOR 1ST WAY------");
		for (int k = 20; k <= 50; k++) {
			if (k % 2 != 0) {
				System.out.println(k);
			}
		}

		// ----------2ND WAY----------
		System.out.println("------WHILE 2ND WAY------");
		int a = 21;
		while (a <= 50) {
			System.out.println(a);
			a += 2;
		}

		System.out.println("------DO WHILE 2ND WAY------");
		int b = 21;
		do {
			System.out.println(b);
			b += 2;
		} while (b <= 50);

		System.out.println("------FOR 2ND WAY------");
		for (int c = 21; c <= 50; c += 2) {
			System.out.println(c);
		}
	}
}
