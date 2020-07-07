package com.syntax.class16;

public class Task4 {
//	Create a method that will say Hello in different language based on the country that will passed when method is executed.

	void sayHello(String country) {

		country = country.toLowerCase();

		switch (country) {
		case "usa":
			System.out.println("Hello");
			break;
		case "turkey":
			System.out.println("Merhaba");
			break;
		case "jordan":
			System.out.println("Ehlen wa Sahlen");
			break;
			
		default:
			System.out.println("Hi");
			break;
		}
	}
	
	public static void main(String[] args) {
		
		Task4 task = new Task4();
		
		task.sayHello("tUrkEy");
	}
}
