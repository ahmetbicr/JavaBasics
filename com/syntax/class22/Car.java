package com.syntax.class22;

public class Car {

	String make;

//	public Car(String make) {
//		this.make = make;
//	}
}

class Tesla extends Car {

	boolean autoPilot;

	public Tesla(String make, boolean autoPilot) {
		super.make = make;
		this.autoPilot = autoPilot;

	}

	void info() {
		System.out.println("We build " + make + " that has autopilot feature = " + autoPilot);
	}
}