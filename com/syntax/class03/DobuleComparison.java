package com.syntax.class03;

public class DobuleComparison {

	public static void main(String[] args) {
		// Create a Java program and name it Double Comparison. Declare 2 double values
		// and if value of first variable is higher then the second, print "Double value
		// __ is larger than __ ." Otherwise print...
		
		double num1 = 756.74;
		double num2 = 756.76;
		
		if(num1 > num2) {
			System.out.println("Double value " + num1 + " is larger than " + num2);
		}else {
			System.out.println("Double value " + num2 + " is larger than " + num1);
		}
	}
}
