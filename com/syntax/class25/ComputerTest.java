package com.syntax.class25;

public class ComputerTest {

	public static void main(String[] args) {

		Computer[] computers = { new Apple("Apple"), new Lenovo("Lenovo"), new HP("HP"), new Dell("Dell") };

		for (Computer comp : computers) {
			comp.displayVideo();
			System.out.println("------");
		}

	}
}
