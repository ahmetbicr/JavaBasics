package com.syntax.class28_HW;

public interface Shape {

	// Create an Interface 'Shape' with undefined methods as calculateArea and
	// calculatePerimiter. Create 2 classes Circle & Square that implements
	// functionality defined in the Shape Interface. Test your code.

	void calculateArea(double radius);

	void calculatePerimeter(double radius);
}

class Circle implements Shape {

	double p = 3.14;
	

	@Override
	public void calculateArea(double radius) {
		System.out.println(p * radius * radius);
	}

	@Override
	public void calculatePerimeter(double radius) {
		System.out.println(2 * p * radius);
	}

}

class Square implements Shape {

	

	public void calculateArea(double side) {
		System.out.println(side * side);
	}

	public void calculatePerimeter(double side) {
		System.out.println(side * 4);
	}

}