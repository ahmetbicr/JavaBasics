package com.syntax.class20;

public class Flower {

	String type;
//	if you are not going to create a constructor, --> Compiler WILL create 1 for you

//	Flower(){ // default non argument
//		
//	}

//	Flower() {
//		System.out.println("I am pointless constructor");
//	}

	// if you create a Constructor then compiler WILL NOT create any other
	// constructor for you
	private Flower(String flowerType) {
		type = flowerType;
	}

	void Flower() { // --> This is not a constructor, this is a method because it has return type
		System.out.println("Printing whatever");
	}

	public void display() {
		System.out.println(type);
	}

	public static void main(String[] args) {

//		Flower flower1 = new Flower();  // CE: since we do not have non argument constructor
//		System.out.println(flower1.type);

		Flower flower2 = new Flower("Tulip");
		flower2.display();
		flower2.Flower();
	}
}
