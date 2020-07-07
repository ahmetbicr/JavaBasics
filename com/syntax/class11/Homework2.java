package com.syntax.class11;

public class Homework2 {

	public static void main(String[] args) {

		// Create a 2D array that first row will contain 4 names and second row will
		// contain grades. Then you program should print name of the students that has A
		// and B grade

		String[][] names = new String[2][4];

		names[0][0] = "Ahmet";
		names[0][1] = "Elion";
		names[0][2] = "John";
		names[0][3] = "Marvel";

		names[1][0] = "A";
		names[1][1] = "B";
		names[1][2] = "C";
		names[1][3] = "D";

		System.out.println("Student " + names[0][0] + " has " + names[1][0] + " grade");
		System.out.println("Student " + names[0][1] + " has " + names[1][1] + " grade");
	}
}
