package com.syntax.class21_1HW;

public class Teacher {

	// Write a Java program called Teacher. Identify features and behaviour of that
	// Class. Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
	// that would have it their own features and behaviour. Test all 4 classes

	String name, lastName;
	int age, experience;
	boolean degree;

	void displayTeaching() {
		System.out.println("Teachers are creating an environment of enthusiasm "
				+ "for learning, appreciation for growing, and room for making mistakes along the way.");
	}

	void displaySupportStudent() {
		System.out.println("Great teachers empathize with students, respect them, and believe that"
				+ " each one has something speacial that can built upon.");
	}
}
