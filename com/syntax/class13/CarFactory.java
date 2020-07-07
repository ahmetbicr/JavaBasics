package com.syntax.class13;

public class CarFactory {

	public static void main(String[] args) {

		// building an object of the car
		Car car1 = new Car();
		car1.make = "Tesla";
		car1.model = "X";
		car1.color = "Red";
		car1.year = 2020;
		car1.speed = 200;
		System.out.println("Make of first car is " + car1.make + " and model is " + car1.model + " and it is in "
				+ car1.color + " color");

		System.out.println("-- Accessing methods from Car class using car1 ---");
		car1.drive();
		car1.reverse();
		car1.transportPeople();

		// building an object of the car-
		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "M5";
		car2.color = "Blue";
		car2.year = 2018;
		car2.speed = 240;
		System.out.println("Make of first car is " + car2.make + " and model is " + car2.model + " and it is in "
				+ car2.color + " color");

		System.out.println("-- Accessing methods from Car class using car2 ---");
		car2.drive();
		car2.reverse();
		car2.transportPeople();

		// new Bus(); compiler will give an error
		// because we never created Bus class

		// ----------HomeWork----------
		// create 2 more Car object, assign features and print them

		Car car3 = new Car();
		car3.make = "Toyota";
		car3.model = "Camry";
		car3.color = "Gray";
		car3.year = 2010;
		car3.speed = 260;
		System.out.println("Make of first car is " + car3.make + " and model is " + car3.model + " and it is in "
				+ car3.color + " color");

		System.out.println("-- Accessing methods from Car class using car3 ---");
		car3.drive();
		car3.reverse();
		car3.transportPeople();

		Car car4 = new Car();
		car4.make = "Honda";
		car4.model = "Civic";
		car4.color = "Black";
		car4.year = 2011;
		car4.speed = 190;
		System.out.println("Make of first car is " + car4.make + " and model is " + car4.model + " and it is in "
				+ car4.color + " color");

		System.out.println("-- Accessing methods from Car class using car4 ---");
		car4.drive();
		car4.reverse();
		car4.transportPeople();

	}
}
