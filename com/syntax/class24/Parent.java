package com.syntax.class24;

public class Parent {

	private void hello() { // private methods do not participate in inheritance => cannot override it
		System.out.println("Hello from parent class");
	}

	protected static void hi() { // static methods do not participate in inheritance => cannot override it
		System.out.println("Hi from parent class");
	}
}

class Child extends Parent {

//	@Override // CE: we cannot override private methods
	private void hello() { // creating own private method inside child class
		System.out.println("Hello from child class");
	}

//	@Override // CE: we cannot override static methods
	public static void hi() { // creating own static method inside child class
		System.out.println("Hi from child class");
	}
}
