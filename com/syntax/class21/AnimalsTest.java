package com.syntax.class21;

public class AnimalsTest {

	public static void main(String[] args) {

		// object of parent class has an access to all
		// variables and methods of it is own class ONLY
		Animal a = new Animal();
		a.breed = "Something";
		a.color = "gray";
		a.paws = 4;

		a.sleep();
		a.eat();

		// object of child class has an access to all
		// variables and methods of it is own class ONLY
		Dog dog = new Dog();
		dog.breed = "Husky";
		dog.color = "Yellow";
		dog.paws = 4;
		dog.tail = true;

		dog.bark();
		dog.eat();
		dog.sleep();

		// create an object of Cat class
		Cat cat = new Cat();
		cat.breed = "";
		cat.color = "Brown";
		cat.paws = 4;
		cat.tail = true;
		cat.fur = "";

		cat.purr();
		cat.eat();
		cat.sleep();

	}
}
