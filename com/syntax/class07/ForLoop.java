package com.syntax.class07;

public class ForLoop {

	public static void main(String[] args) {

		// Print numbers from 1 to 5

		int a = 1; // 1. initialization
		while (a <= 5) { // 2. condition
			System.out.println(a);
			a++; // 3. increment
		}
		
		System.out.println("----------------------");

		// When you know how many times it will execute, we should go with for loop
		for (int i = 1; i <= 5; i++) { // 1-2-3 all of them in same parenthesis
			System.out.println(i);
		}
	}
}
