package com.syntax.class28_HW;

public class CarTest {

	public static void main(String[] args) {

		Car car1 = new Sedan(100000, "Yellow", 40);
		System.out.println(car1.calculateSalePrice());

		Car car2 = new Truck(20000, "Black", 280);
		System.out.println(car2.calculateSalePrice());

		System.out.println("---------------------------");

		Car[] cars = { new Sedan(100000, "Yellow", 40), new Truck(20000, "Black", 280) };

		for (Car car : cars) {
			System.out.println(car.calculateSalePrice());
		}
	}
}
