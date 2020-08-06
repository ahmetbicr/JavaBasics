package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {

//	Create an arrayList of words. Remove every word that ends with "e".

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<String>();

		words.add("Syntax");
		words.add("Ahmet");
		words.add("John");
		words.add("Neo");
		words.add("Trinity");
		words.add("Kobe");

		Iterator<String> iteratorWords = words.iterator();

		System.out.println("Before removing");
		System.out.println(words);

		while (iteratorWords.hasNext()) {
			if (iteratorWords.next().endsWith("e")) {
				iteratorWords.remove();
			}
		}

		System.out.println("After removing");
		System.out.println(words);
	}
}
