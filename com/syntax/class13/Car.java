package com.syntax.class13;

public class Car {

	// define car features in a from of variables --> noun
	String make;
	String model;
	String color;
	int year;
	int speed;

	public static void main(String[] args) {

		System.out.println("Hello, I am code from main method");

		Car c1 = new Car();
		c1.make = "Toyota";
		c1.model = "Camry";
		c1.color = "Yellow";
		c1.year = 2020;
		c1.speed = 180;

		// calling method reverse
		c1.reverse();
		// calling method drive
		c1.drive();
		// calling method transportPeople
		c1.transportPeople();
		// calling method stop
		c1.stop();
	}

	// define behavior in a from of methods --> verb
	void reverse() {
		System.out.println(make + " can reverse");
	}

	void transportPeople() {
		System.out.println(make + " can transport people");
	}

	void drive() {
		System.out.println(make + " can drive");
	}

	void stop() {
		System.out.println(make + " will stop when break press break");
		System.out.println(make + " stop");
	}

}
