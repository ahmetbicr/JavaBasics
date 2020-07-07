package com.syntax.class16;

public class Task2 {
//	Create a method that will take a number and prints whether the number is even or odd.

	void evenOrOdd(int num1) {
		if (num1 % 2 == 0) {
			System.out.println(num1 + " is an even number");
		} else {
			System.out.println(num1 + " is an odd number");
		}
	}

	public static void main(String[] args) {

		Task2 task = new Task2();

		task.evenOrOdd(10);
		task.evenOrOdd(7);
	}
}
