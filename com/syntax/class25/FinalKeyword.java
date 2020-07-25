package com.syntax.class25;

public final class FinalKeyword {

	public static String str = "Hello";

	public static final String USERNAME = "Admin"; // final variables MUST be initialized

	public final String PASSWORD = "Admin123";

	public static void main(String[] args) {

		System.out.println(str);
		str = "hi";
		System.out.println(str);

		System.out.println(USERNAME);
//		USERNAME = "User123"; // CE: Variable is final and we cannot change it is value

		FinalKeyword fk = new FinalKeyword();
//		fk.PASSWORD = "user123"; // CE: Variable is final and we cannot change it is value
		System.out.println(fk.PASSWORD);
	}

	public final void hello() {
		System.out.println("Last hello today");
	}

}

// FINAL CLASS CAN NOT BE INHERIT
//class FinalBaby extends FinalKeyword {
//
//	// FINAL METHODS CAN NOT BE OVERRIDEN
////	public void hello() { // CE
////		System.out.println("Sorry it is not last hello");
////	}
//}
