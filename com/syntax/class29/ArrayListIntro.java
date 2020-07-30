package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		// too add values to the arraylist

		arrayList.add("Hello"); // 0 index
		arrayList.add("Welcome"); // 1 index
		arrayList.add("How are you"); // 2 index

		System.out.println("--------- Original arrayList " + arrayList);

		// How many elements inside my arrayList
		int arrayListSize = arrayList.size();
		System.out.println("Size of original arrayList = " + arrayListSize);

		// How to access elements from ArrayList
		String elementIndex2 = arrayList.get(2);
		System.out.println(elementIndex2);

		// I would like to add more Object intro ArrayList
		arrayList.add("Good Bye"); // 3 index
		arrayList.add("Thank you"); // 4 index

		System.out.println("Size of arrayList after adding more String Objects =  " + arrayList.size());
		System.out.println("--------- ArrayList after adding more Object " + arrayList);

		// Let's remove "Hello";
//		arrayList.remove("Hello");
		arrayList.remove(0);

		System.out.println("Size of arrayList after removing Objects =  " + arrayList.size());
		System.out.println("--------- ArrayList after removing Object " + arrayList);

		// I want to update value "Good Bye" --> "Bye"
		arrayList.set(2, "Bye");

		System.out.println("--------- ArrayList after replacing Object " + arrayList);

		// add
		// remove
		// set
		// size
		// get
		// justname for print it out

	}
}
