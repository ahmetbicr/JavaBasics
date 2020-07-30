package com.syntax.class29;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task {

//	Create an ArrayList that will store 5 names into it. 
//	Find out whether the given ArrayList is empty or not? 
//	Check whether the specific name is present in an ArrayList or not?
//	Find the size of your arrayList and print all values from that

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		names.add("Ahmet");
		names.add("John");
		names.add("Will");
		names.add("Bruce");
		names.add("Leonardo");

		System.out.println("Is arraylist empty ? = " + names.isEmpty());

		System.out.println("Is Ahmet belongs to arraylist ? = " + names.contains("Ahmet"));

		System.out.println("Size of arraylist = " + names.size());

		System.out.println(names);

		names.clear();

		System.out.println("names collection after clear " + names);

		ArrayList<String> list = new ArrayList<>();

		list.add("Ahmet");
		list.add("Gozde");
		list.add("Kamila");
		list.add("Ihsan");
		list.add("Artur");
		System.out.println(list);

		names.addAll(list);

		System.out.println("Names after adding all object from list collection " + names);

		System.out.println("Objects inside inside list collection " + list);

		names.remove("Artur");
		System.out.println("Arraylist names after removing Artur " + names);

		ArrayList<String> arrayName = new ArrayList<>();

		arrayName.add("Igor");
		arrayName.add("Ivan");
		arrayName.add("Olga");
//		arrayName.add(10.99); CE:

		names.addAll(arrayName);
		System.out.println(names);

		names.removeAll(arrayName);
		System.out.println(names);

		// Generic collection
		ArrayList<String> myList = new ArrayList<>(arrayName);
		System.out.println(myList);

		// before java 1.5 collections was not Generic
		// non Generic collection
		ArrayList alist = new ArrayList();
		alist.add("String");
		alist.add(100);
		alist.add(10.99);
		alist.add('c');
		alist.add(true);

		System.out.println("Non generic ArrayList collection " + alist);

	}
}
