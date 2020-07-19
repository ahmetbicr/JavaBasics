package com.syntax.class24;

public class Student {

//	Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 
//	Define common behavior within parent class and override some of the methods in child classes
//	Define some methods specific to child classes
//	Write example of achieving run time polymorphism

	public void studyHard() {
		System.out.println("All students study hard");
	}

	public void likeToDrinkCoffee() {
		System.out.println("All students drink coffee");
	}

	public void takeBreath() {
		System.out.println("All students take breath");
	}

}

class SyntaxStudent extends Student {

	@Override
	public void studyHard() {
		System.out.println("Syntax students are studying hard");
	}

	@Override
	public void likeToDrinkCoffee() {
		System.out.println("Syntax students dont like coffee. They usually drink tea");
	}

	public void doPractice() {
		System.out.println("Syntax students are doing practice");
	}

}

class CollegeStudent extends Student {

	@Override
	public void studyHard() {
		System.out.println("College students are not studying hard");
	}

	@Override
	public void likeToDrinkCoffee() {
		System.out.println("College students like Starbucks coffee");
	}

	public void hangouts() {
		System.out.println("College students like hangouts");
	}

}

class SchoolStudent extends Student {

	public void complainsBoringLife() {
		System.out.println("School students always complain about boring life");
	}

	@Override
	public void studyHard() {
		System.out.println("School students have to studying hard more than anyone");
	}

}