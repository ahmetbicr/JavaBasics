package com.syntax.class21_1HW;

public class TeacherTest {

	public static void main(String[] args) {

		Teacher teacher = new Teacher();
		teacher.name = "Barbara";
		teacher.lastName = "Stewart";
		teacher.age = 50;
		teacher.experience = 20;

		teacher.displaySupportStudent();
		teacher.displayTeaching();

		MathTeacher mathTeacher = new MathTeacher();
		mathTeacher.name = "Isabella";
		mathTeacher.lastName = "Parker";
		mathTeacher.age = 33;
		mathTeacher.experience = 5;
		mathTeacher.degree = true;
		mathTeacher.allowUniqueApproach = true;
		mathTeacher.attributes = "something";

		mathTeacher.displayInfo();
		mathTeacher.displayExtensiveUnderstandingMath();

		ChemistryTeacher chemistryTeacher = new ChemistryTeacher();
		chemistryTeacher.name = "Liam";
		chemistryTeacher.lastName = "Thompson";
		chemistryTeacher.age = 36;
		chemistryTeacher.experience = 8;
		chemistryTeacher.degree = true;
		chemistryTeacher.extraLab = true;

		chemistryTeacher.displayInfo();
		chemistryTeacher.displayHandsOnProject();

		PianoTeacher pianoTeacher = new PianoTeacher();
		pianoTeacher.name = "James";
		pianoTeacher.lastName = "Wyatt";
		pianoTeacher.age = 42;
		pianoTeacher.experience = 15;
		pianoTeacher.degree = true;
		pianoTeacher.passionate = true;
		pianoTeacher.patient = true;

		pianoTeacher.displayInfo();
		pianoTeacher.displayCharacteristic();

	}
}
