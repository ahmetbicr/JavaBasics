package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {

		String name = "Ahmet";
		String lastName = "Bicer";
		char grade = 'A';
		String city = "Pittsburgh";
		String state = "PA";
		int phoneNumber = 758827385;

		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);

		grade = 'B';
		state = "CT";
		phoneNumber = 453476384;
		city = "Hartford";

		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);

		// Task:
		// 1. My name is __ and my last name is ___.
		// 2. I live in city of ___ state ___ and my phone number is ____ !

		System.out.println("My name is " + name + " and my last name is " + lastName + "."	);
		System.out.println("I live in city of " + city + " state " + " and my phone is " + phoneNumber + "!");
	}
}
