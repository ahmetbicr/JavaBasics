package com.syntax.class24;

public class StudentTest {

	public static void main(String[] args) {

		System.out.println("----------SyntaxStudent obj1 = new SyntaxStudent();-------");
		SyntaxStudent obj1 = new SyntaxStudent();
		obj1.doPractice();
		obj1.likeToDrinkCoffee();
		obj1.studyHard();
		obj1.takeBreath();

		System.out.println();
		System.out.println("----------Student obj2 = new SyntaxStudent();-------");
		Student obj2 = new SyntaxStudent();
		obj2.likeToDrinkCoffee();
		obj2.studyHard();
		obj2.takeBreath();

		System.out.println();
		System.out.println("----------CollegeStudent obj3 = new CollegeStudent();-------");
		CollegeStudent obj3 = new CollegeStudent();
		obj3.studyHard();
		obj3.likeToDrinkCoffee();
		obj3.hangouts();
		obj3.takeBreath();

		System.out.println();
		System.out.println("----------Student obj4 = new CollegeStudent();-------");
		Student obj4 = new CollegeStudent();
		obj4.studyHard();
		obj4.likeToDrinkCoffee();
		obj4.takeBreath();

		System.out.println();
		System.out.println("----------SchoolStudent obj5 = new SchoolStudent();-------");
		SchoolStudent obj5 = new SchoolStudent();
		obj5.complainsBoringLife();
		obj5.studyHard();
		obj5.likeToDrinkCoffee();
		obj5.takeBreath();

		System.out.println();
		System.out.println("----------Student obj6 = new SchoolStudent();-------");
		Student obj6 = new SchoolStudent();
		obj6.studyHard();
		obj6.likeToDrinkCoffee();
		obj6.takeBreath();

	}

}
