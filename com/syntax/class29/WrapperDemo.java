package com.syntax.class29;

public class WrapperDemo {

	public static void main(String[] args) {

		int num = 10;

		Integer num1 = 100; // Autoboxing
		String str = num1.toString().concat("hello");
		System.out.println(str);

		int stringLength = num1.toString().length();
		System.out.println(stringLength);

		Byte b = 20;
		System.out.println(b.MAX_VALUE);

		Boolean bool = true;

		Character ch = 'a';

		Double d = 10.99;

	}

}
