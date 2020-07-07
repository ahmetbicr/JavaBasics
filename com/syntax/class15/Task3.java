package com.syntax.class15;

public class Task3 {

	// You have a String a=“Is it saturday? Is it raining? Do we have a Java Class
	// today?” How would you find out how many sentences are in that String?

	public static void main(String[] args) {

		String a = "Is it saturday? Is it raining? Do we have a Java Class today?";

		String[] array = a.split("[?]");

		System.out.println(array.length);

		for (String element : array) {
			System.out.println(element);
		}
	}
}
