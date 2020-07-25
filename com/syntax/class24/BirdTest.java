package com.syntax.class24;

public class BirdTest {

	public static void main(String[] args) {

		Bird bird = new BabyBird(); // upcasting --> object of subclass is referred by a Superclass
		// achieving runtime polymorphism
		bird.fly();
		bird.eat();
		bird.sleep();
//		bird.cry(); not available
		// during compilation compiler gives an access to methods
		// based on reference type

		System.out.println("--------------");

		BabyBird bb = new BabyBird();
		bb.fly();
		bb.sleep();
		bb.cry();
		bb.eat();

	}

}