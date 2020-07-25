package com.syntax.class27;

public class MotorcylceTest {

	public static void main(String[] args) {

//		new Drivable(); // CE: cannot instantiate

//		new Motorcycle(); // CE: cannot instantiate

		System.out.println("----- Object of Motorcycle type -----");

		Motorcycle m = new Bike(); // upcasting
		m.breaking();
		m.driving();
		m.operateVehicle();

//		Motorcycle.DRIVE = "not safe"; // CE: cannot change value of final
		System.out.println(Motorcycle.DRIVE); // static variable accessible through class name

		System.out.println("----- Object of Drivable type -----");

		Drivable d = new Bike(); // upcasting
		d.breaking();
		d.driving();
//		d.operateVehicle(); // CE: drivable has no relationship with vehicle
		System.out.println(Drivable.DRIVE);

		Vehicle v = new Bike(); // Vehicle --> Motorcycle --> Bike
		v.operateVehicle();

//		Bike b = new Bike();
//		b.breaking();
//		b.operateVehicle();
//		b.driving();
	}

}
