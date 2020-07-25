package com.syntax.class27;

public interface Drivable { // interface is collection of public abstract methods
							// and public static final variables

	String DRIVE = "Drive safe"; // by default compiler adds public static final to variables

//	int maxSpeed; // cannot have instance variables because compiler adds public static final

	void driving(); // by default compiler adds public abstract to methods

	void breaking();

}

abstract class Motorcycle extends Vehicle implements Drivable { // abstract class

	@Override
	public void driving() {
		System.out.println("Motorcycle is driving");
	}

}

class Bike extends Motorcycle { // concrete class

	@Override
	public void breaking() {
		System.out.println("Bike can break");
	}
}

class Vehicle {

	public void operateVehicle() {
		System.out.println("To operate any vehicle we need to have driving lisence");
	}
}
