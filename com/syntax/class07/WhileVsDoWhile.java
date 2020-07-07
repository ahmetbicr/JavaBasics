package com.syntax.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {

		// print hello 3 times

		int x = 1;
		while (x <= 3) { // checks before going into the loop
			System.out.println("Hello");
			x++;
		}

		System.out.println("-------------Do While Loop-------------");

		int y = 1;
		do {
			System.out.println("Hello");
			y++;
		} while (y <= 3); // checks after going into the loop

	}
}
