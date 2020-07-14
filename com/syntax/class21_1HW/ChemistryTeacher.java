package com.syntax.class21_1HW;

public class ChemistryTeacher extends Teacher {

	boolean extraLab;

	void displayHandsOnProject() {
		System.out.println("Chemistry teachers are supervising laboratory activities for students.");
	}

	void displayInfo() {
		System.out.println(name + " " + lastName + " is Chemistry teacher. " + name + " is " + age + " years old with "
				+ experience + " years of experience.");
	}
}
