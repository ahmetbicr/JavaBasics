package com.syntax.class12;

public class Homework2IsPrime {

	// Write a java program to check whether a given number is prime or not?
	
	public static void main(String[] args) {
		
		int number = 900;
		boolean isPrime = true;
		
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("This number " + number + " is prime");
		}else {
			System.out.println("This number " + number + " is NOT prime");
		}
	}
}
