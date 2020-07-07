package com.syntax.class15;

public class Task1 {

	// Create a String that will hold a sentence. Write a program to get a new
	// String without any spaces.

	public static void main(String[] args) {

		String sentence = "Hello my name is Ahmet";

		System.out.println(sentence);

		sentence = sentence.replace(" ", "");

		System.out.println(sentence);
	}
}
