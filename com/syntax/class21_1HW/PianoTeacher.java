package com.syntax.class21_1HW;

public class PianoTeacher extends Teacher {

	boolean passionate;
	boolean patient;

	void displayCharacteristic() {
		System.out.println("An inspiring piano teacher makes learning fun! It's rare for student to be intrinsically "
				+ "motivated and ready to learn for just the sake of learning itself.");
	}

	void displayInfo() {
		System.out.println(name + " " + lastName + " is Piano teacher. " + name + " is " + age + " years old with "
				+ experience + " years of experience.");
	}
}
