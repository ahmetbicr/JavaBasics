package com.syntax.class11;

public class RetrieveElement {

	public static void main(String[] args) {

		char[] grades = { 'A', 'B', 'C', 'D', 'F' };

		// print all the grades
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + " ");
		}
		System.out.println();

		System.out.println("----------Print using advanced/enhanced loop, for each loop-----------");

		for (char element : grades) {
			System.out.print(element + " ");
		}
		System.out.println();

		System.out.println("------------------------------");

		String[] fruits = { "Apple", "Orange", "Grapes", "Banana", "Cucumber" };
		// Print all the fruits in two different ways

		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals("Grapes")) {
				System.out.println(fruits[i] + " is my favorite fruit");
				continue;
			}
			System.out.println(fruits[i]);
		}

		System.out.println("---------------");

		for (String fruit : fruits) {
			if (fruit.equals("Grapes")) {
				System.out.println(fruit + " is my favorite fruit");
				continue;
			}
			System.out.println(fruit);
		}
	}
}
