package com.syntax.class15;

public class Homework2 {

//	How would you reverse a String word by word?

	public static void main(String[] args) {

		String str = "Hi guys my name is Ahmet";

		String[] array = str.split(" ");

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
}
