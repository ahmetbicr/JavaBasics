package com.syntax.class13;

public class PhoneFactory {

	public static void main(String[] args) {

		System.out.println("----------1st Phone----------");

		Phone phone1 = new Phone();

		phone1.make = "Iphone";
		phone1.model = "XS+";
		phone1.color = "Space gray";
		phone1.wirelessCharging = true;
		phone1.camera = 8;

		System.out.println("Make of first phone is " + phone1.make + " and model is " + phone1.model + " and it is in "
				+ phone1.color + " color and it has wireless charging is: " + phone1.wirelessCharging);
		phone1.call();
		phone1.playGame();

		System.out.println("----------2nd Phone----------");

		Phone phone2 = new Phone();

		phone2.make = "Samsung";
		phone2.model = "Note 10";
		phone2.color = "Blue";
		phone2.wirelessCharging = true;
		phone2.camera = 10;

		System.out.println("Make of first phone is " + phone2.make + " and model is " + phone2.model + " and it is in "
				+ phone2.color + " color and it has wireless charging is: " + phone2.wirelessCharging);
		phone2.call();
		phone2.playGame();

		System.out.println("----------3rd Phone----------");

		Phone phone3 = new Phone();

		phone3.make = "Nokia";
		phone3.model = "6600";
		phone3.color = "Gray";
		phone3.wirelessCharging = false;
		phone3.camera = 2;

		System.out.println("Make of first phone is " + phone3.make + " and model is " + phone3.model + " and it is in "
				+ phone3.color + " color and it has wireless charging is: " + phone3.wirelessCharging);
		phone3.call();
		phone3.playGame();
	}
}
