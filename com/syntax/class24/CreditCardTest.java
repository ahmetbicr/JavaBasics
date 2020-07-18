package com.syntax.class24;

public class CreditCardTest {

	public static void main(String[] args) {
		CreditCard cc = new CreditCard(5000);
		System.out.println(cc.calculateInterest());

		Visa visa = new Visa(7000);
		System.out.println(visa.calculateInterest());

		AX ax = new AX(3000);
		System.out.println(ax.calculateInterest());
	}
}
