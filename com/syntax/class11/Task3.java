package com.syntax.class11;

public class Task3 {

	public static void main(String[] args) {

		// Create an array of countries. While retrieving all values from an array print
		// capital for each country.(using if or switch)

		String[] countries = { "Turkey", "Usa", "France", "Italy", "England" };

		String capital = null;
		for (String country : countries) {
			switch (country) {
			case "Turkey":
				capital = "Ankara";
				break;
			case "France":
				capital = "Paris";
				break;
			case "England":
				capital = "London";
				break;
			case "Usa":
				capital = "Washington DC";
				break;
			case "Italy":
				capital = "Roma";
				break;

			}
			System.out.println("Capital of the " + country + " is " + capital);
		}

		// HW
//		for (String country : countries) {
//			for (String city : cities) {
//				System.out.println(country + " = " + city);
//			}
//		}
	}
}
