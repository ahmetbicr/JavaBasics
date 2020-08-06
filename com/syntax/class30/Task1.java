package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {

//	Create an arraylist of cars and retrieve all the values using 3 different ways.

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();

		cars.add("Toyota");
		cars.add("Tesla");
		cars.add("Jeep");
		cars.add("BMW");
		cars.add("Acura");

		System.out.println("------------ 1st Way ------------");

		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}

		System.out.println("------------ 2nd Way ------------");

		for (String car : cars) {
			System.out.println(car);
		}

		System.out.println("------------ 3rd Way ------------");

		Iterator<String> iteratorCars = cars.iterator();

		while (iteratorCars.hasNext()) {
			System.out.println(iteratorCars.next());
		}
	}

}
