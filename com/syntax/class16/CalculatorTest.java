package com.syntax.class16;

public class CalculatorTest {

	public static void main(String[] args) {

		// call method add();
		Calculator c = new Calculator();

		c.add(100, 200);
		c.add(10, 20);
		c.add(1000, 2000);

		c.sub(100, 10);

		c.div(10, 2);

		c.mult(10, 10);

//		c.mult(10); --> compiler error CE: number of values must match number of parameter

//		c.mult(10.99, 9.99); --> compiler error CE: values must match type of parameter

		
	}
}
