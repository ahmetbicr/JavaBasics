package com.syntax.class12;

public class Homework1SwapNumbers {

	// Write a program to swap 2 numbers without a temporary variable?
	//
	// int a=20;
	// int b=30;

	public static void main(String[] args) {

		int a = 20;
		int b = 30;

		System.out.println("Before changing a = " + a);
		System.out.println("Before changing b = " + b);

		b = a + b;
		a = b - a;
		b = b - a;

		System.out.println("After changing a = " + a);
		System.out.println("After changing b = " + b);

	}
}
