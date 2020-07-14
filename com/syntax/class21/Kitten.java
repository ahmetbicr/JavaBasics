package com.syntax.class21;

public class Kitten extends Cat{

	public static void main(String[] args) {
		
		Kitten kit = new Kitten();

		kit.breed = "asdf";
		kit.color = "yellow";
		kit.fur = "asdf";
		kit.paws = 4;
		kit.tail = false;
		
		kit.eat();
		kit.sleep();
		kit.purr();
	}
}
