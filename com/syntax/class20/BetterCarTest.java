package com.syntax.class20;

public class BetterCarTest {

	public static void main(String[] args) {

		BetterCar car = new BetterCar("x5", "Red", 2020, 80000);
		car.displayInfo();

		BetterCar car1 = new BetterCar("Model S", "Silver", 2019, 90000);
		car1.displayInfo();

//		new BetterCar(carModel, carColor); //CE: because we do not have a constructor with 2 parameter inside BetterCar class

//		new BetterCar(); //CE: Because we do not have a non argument constructor inside BetterCar class
	}
}
