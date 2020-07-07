package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {

		// 1.Create an array of names and store all names of your group. Then print your
		// name from that array. (use 2 different ways of creating an array).

		String[] names1 = { "Ahmet", "Bicer" };
		System.out.println(names1[0] + " " + names1[1]);

		String[] names2 = new String[4];
		names2[0] = "Ahmet";
		names2[1] = "Bicer";

		System.out.println(names2[0] + " " + names2[1]);
	}
}
