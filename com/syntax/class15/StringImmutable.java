package com.syntax.class15;

public class StringImmutable {

	public static void main(String[] args) {

		String str = "Today is a good day"; // new object gets created

		str = str.replace("good", "amazing"); // new object gets created and that object is assigned to str
		System.out.println(str);

		str.concat(".I love Sundays"); // new object gets created but no one is referring to that object
		System.out.println(str); // original str did not get changed

		str.toUpperCase(); // new object gets created but no one is referring to that object
		System.out.println(str); // original str did not get changed

		String str1 = new String("Hello");
		str1.toUpperCase(); // new object gets created but no one is referring to that object
		System.out.println("Value of str1 = " + str1); // original str1 did not get changed

		String str2 = "Hello";
		String str3 = "Hello";
		String str4 = "Hello";

		str2.toUpperCase(); // completely new String Object is getting created
		System.out.println("Value of str2 if we did not assign it = " + str2);
		str2 = str2.toUpperCase();
		System.out.println("Value of str2 after = " + str2);

		System.out.println("Value of str3 = " + str3);
		System.out.println("Value of str4 = " + str4);
	}
}
