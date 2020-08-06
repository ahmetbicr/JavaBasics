package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingElementsFromCollection {

	public static void main(String[] args) {

		// create an arraylist of city names

		ArrayList<String> cities = new ArrayList<>();

		cities.add("Kyiv");
		cities.add("LA");
		cities.add("DC");
		cities.add("Istanbul");
		cities.add("LA");
		cities.add("New York");

		System.out.println("Original arrayList === " + cities);
		// remove ccities LA, DC

		System.out.println(" ---------- Removing Objects from ArrayList using for loop ---------- ");
		for (int i = 0; i < cities.size(); i++) {
			if (cities.get(i).equals("LA") || cities.get(i).equals("DC")) {
				cities.remove(i);
				System.out.println(cities);
			}
		}

		System.out.println("Final arraylist === " + cities);

		System.out.println(" ---------- Removing Objects from ArrayList enhanced loop ---------- ");
//		for (String city : cities) {
//			if (city.equals("New York")) {
//				cities.remove(city);
//			}
//		}

		System.out.println(cities);

		System.out.println(" ---------- Removing Objects from ArrayList iterator ---------- ");

		cities.add("LA");
		cities.add("LA");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Moscow");

		System.out.println(" ---------- Collection before iterator == " + cities);

		Iterator<String> citiesIt = cities.iterator();

		// lets remove New York and LA objects
		while (citiesIt.hasNext()) {
			String ci = citiesIt.next();
			if (ci.equals("LA") || ci.equals("Moscow")) {
				citiesIt.remove();
			}
		}

		System.out.println("ArrayList after modifications from Iterator: " + cities);
	}

}
