package com.syntax.class25;

public class Computer {

//	Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 
//	Define common behavior within and some fields in parent class and override some of the methods in child classes
//	Define some methods specific to child classes
//	Create objects of child classes and store them into array. Loop through each object and execute available methods

	String brand;

	public Computer(String brand) {
		this.brand = brand;
	}

	public void displayVideo() {
		System.out.println(brand + " can display video with 480P regularly");
	}
}

class Apple extends Computer {

	public Apple(String brand) {
		super(brand);
	}

	@Override
	public void displayVideo() {
		System.out.println(brand + " can display video with 4K HD");
	}
}

class Lenovo extends Computer {

	public Lenovo(String brand) {
		super(brand);
	}
}

class HP extends Computer {

	public HP(String brand) {
		super(brand);
	}
}

class Dell extends Computer {

	public Dell(String brand) {
		super(brand);
	}

	@Override
	public void displayVideo() {
		System.out.println(brand + " can display video with 144P");
	}
}
