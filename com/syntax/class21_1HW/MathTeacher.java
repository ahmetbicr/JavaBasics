package com.syntax.class21_1HW;

public class MathTeacher extends Teacher {

	boolean allowUniqueApproach;
	String attributes;

	void displayExtensiveUnderstandingMath() {
		System.out.println("Every great math teacher has an extensive understanding of mathematics.");
	}

	void displayInfo() {
		System.out.println(name + " " + lastName + " is Math teacher. " + name + " is " + age + " years old with "
				+ experience + " years of experience.");
	}
}
