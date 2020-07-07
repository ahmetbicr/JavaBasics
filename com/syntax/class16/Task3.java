package com.syntax.class16;

public class Task3 {
//	Create a method that will print whether given String is palindrome or not.

	void palindrome(String str) {

		str = str.replace(" ", "");

		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}

		if (reversed.equalsIgnoreCase(str)) {
			System.out.println("This string is palindrome");
		} else {
			System.out.println("This string is NOT palindrome");
		}
	}

	public static void main(String[] args) {

		Task3 task = new Task3();

		task.palindrome("nEveR oDd Or EVen");
	}
}
