package com.syntax.class14;

public class StringDifference {

	public static void main(String[] args) {

		String name = "Madeeha";

		String name1 = new String("Madeeha");
//		name1 = "Madeeha";

		System.out.println(name);
		System.out.println(name1);

		if (name.equals(name1)) {
			System.out.println("Strings are equal using by .equals method");
		}

		if (name == name1) {
			System.out.println("Strings are equal using by == operator");
		}

		String name2 = "Madeeha";
		if (name == name2) {
			System.out.println("2 Strings are equal");
		}
	}

}
