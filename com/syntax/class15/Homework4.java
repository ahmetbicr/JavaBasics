package com.syntax.class15;

public class Homework4 {

//	How would you swap  2 strings without a temporary variable?

	public static void main(String[] args) {

		String str1 = "I Love Java";
		String str2 = "We are family in Syntax Tech";

		System.out.println("Before swap: \nstr1 = " + str1 + " \nstr2 = " + str2);

		str1 = str1.concat(str2);

		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("---------------");
		System.out.println("Aftwe swap: \nstr1 = " + str1 + " \nstr2 = " + str2);
	}
}
