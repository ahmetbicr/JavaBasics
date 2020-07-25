package com.syntax.class27;

public interface Trustable {

	public abstract void trust();
}

interface Bank extends Trustable {

	void deposit();

	void withdraw();

}

class PNC extends Mortgage implements Bank, Investments {

	@Override
	public void trust() {
		System.out.println("You can trust PNC with your money");
	}

	@Override
	public void deposit() {
		System.out.println("PNC bank takes deposits");
	}

	@Override
	public void withdraw() {
		System.out.println("PNC gives you your money");
	}

	public void giveMortgage() {
		System.out.println("PNC gives mortgage");
	}

	@Override
	public void doInvestments() {
		System.out.println("You can invest your money with PNC");
	}

}