package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> food = new LinkedList<>();
		food.add("beshparmak");
		food.add("pizza");
		food.add("biryani");
		food.add("tacos");

		String myFood = food.get(2);
		System.out.println(myFood);

		LinkedList<String> deserts = new LinkedList<>();
		deserts.add("cake");
		deserts.add("ice cream");
		deserts.add("cookies");

		food.addAll(deserts);
		System.out.println("LinkedList after adding another collection ::::: " + food);

		food.remove("pizza");
		System.out.println("LinkedList after removing element ::::: " + food);

		System.out.println("LinkedList after replacing element ::::: " + food);
		food.set(3, "brownie");

		// I want to get all values 1 by 1
		Iterator<String> foodIterator = food.iterator();

		while (foodIterator.hasNext()) {
			String fooood = foodIterator.next();
			System.out.print(fooood + "  ");
			if (fooood.equals("cookies") || fooood.equals("brownie")) {
				foodIterator.remove();
			}
		}

		System.out.println();
		System.out.println("LinkedList after Iterator ::::: " + food);

		// lets create linked list with Country type of objects
		LinkedList<Country> countries = new LinkedList<>();
		countries.add(new USA("USA"));
		countries.add(new Kazakhstan("Kazakhstan"));
		countries.add(new Afghanistan("Afghanistan"));

		System.out.println("Collection of Country Object has " + countries.size() + " elements");

		for (Country country : countries) {
			country.election();
		}
	}

}