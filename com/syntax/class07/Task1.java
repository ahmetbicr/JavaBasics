package com.syntax.class07;

public class Task1 {

	public static void main(String[] args) {

		// How to print 50 to 1

		int x = 50;
		while (x >= 1) {
			System.out.println(x);
			x--;
		}

		System.out.println("------------------------");

		// How to print odds numbers from 1 to 20
		// 1, 3, 5, 7, 9, 11, 13, 15, 17, 19

		// Wrong way, go to jail because of "code redundancy"
//		System.out.println("1");
//		System.out.println("3");
//		System.out.println("5");
//		System.out.println("7");
//		System.out.println("9");

		// 1st way, using mod (%)
		int y = 1;
		while (x <= 20) {
			if (x % 2 == 1) {
				System.out.println(x);
			}
			x++;
		}

		System.out.println("------------------------");

		// 2nd way, increasing by 2
		int z = 1;
		while (z <= 20) {
			System.out.println(z);
			z += 2;
		}

		System.out.println("------------------------");

		// 3rd way
		int g = 0;
		while (g < 20) {
			g++;
			System.out.println(g);
			g++;
		}

		System.out.println("------------------------");

		// 4th way

		int h = 0;
		while (h < 20) {
			System.out.println(++h);
			h++;
		}

	}
}
