package com.syntax.class16;

public class Task1 {
//	Create a method that will take 2 parameters as a numbers and prints which number is larger.

	void larger(int a, int b) {
		if (a > b) {
			System.out.println(a + " is larger than " + b);
		} else if (a == b) {
			System.out.println(a + " is equals to " + b);
		} else {
			System.out.println(a + " is smaller than " + b);
		}
	}

	public static void main(String[] args) {

		Task1 task = new Task1();
		
		task.larger(5, 10);
		task.larger(3, 3);
		task.larger(7, 1);
		
	}
}
