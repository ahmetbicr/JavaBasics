package com.syntax.class28_HW;

public class Car {

	// Create a Class Car that would have the following fields: carPrice and color
	// and method calculateSalePrice() which should be returning a price of the car.
	// Create 2 sub classes: Sedan and Truck. The Truck class has field as weight
	// and has its own implementation of calculateSalePrice() method in which
	// returned price calculated as following: if weight>2000 then returned price
	// car should include 10% discount, otherwise 20% discount.
	// The Sedan class has field as length and also does it is own implementation of
	// calculateSalePrice(): if length of sedan is >20 feet then returned car price
	// should include 5% discount, otherwise 10% discount

	double carPrice;
	String color;

	public Car(double carPrice, String color) {
		this.carPrice = carPrice;
		this.color = color;
	}

	public double calculateSalePrice() {
		return carPrice;
	}
}

class Sedan extends Car {

	int length;

	public Sedan(double carPrice, String color, int length) {
		super(carPrice, color);
		this.length = length;
		// TODO Auto-generated constructor stub
	}

	public double calculateSalePrice() {
		if (length > 20) {
			carPrice -= carPrice * 0.05;
		} else {
			carPrice -= carPrice * 0.1;
		}
		return carPrice;
	}
}

class Truck extends Car {

	int weight;

	public Truck(double carPrice, String color, int weight) {
		super(carPrice, color);
		this.weight = weight;
	}

	public double calculateSalePrice() {
		if (weight > 2000) {
			carPrice = carPrice - (carPrice * 0.1);
		} else {
			carPrice = carPrice - (carPrice * 0.2);
		}

		return carPrice;
	}
}
