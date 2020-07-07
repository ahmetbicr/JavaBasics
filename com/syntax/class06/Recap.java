package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {
		// if hour is between 1 - 11 --> morning
		// if hour is between 12 - 15 --> afternoon
		// if hour is between 16 - 20 --> evening
		// if hour is between 21 - 24 --> night
		// We will print: Right now it is __________

		int hour;
		hour = 11;
		String dayTime;

		if (hour >= 1 && hour <= 11) {
			dayTime = "Morning";
		} else if (hour >= 12 && hour <= 15) {
			dayTime = "Afternoon";
		} else if (hour >= 16 && hour <= 20) {
			dayTime = "Evening";
		} else if (hour >= 21 && hour <= 24) {
			dayTime = "Night";
		} else {
			dayTime = "Unknown";
		}

		// if it is unknown I don't want to print anything
		if (!dayTime.equals("Unknown")) {
			System.out.println("Right now it is " + dayTime);
		}
		
	}
}
