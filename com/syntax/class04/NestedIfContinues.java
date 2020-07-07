package com.syntax.class04;

public class NestedIfContinues {

	public static void main(String[] args) {
		// Check if patient has allergies
		// if no allergies --> you are healthy
		// otherwise :
		// if peanut allergy: Don't eat peanut
		// Lactose allergy: Don't drink milk
		// bee allergy: Don't mess with bees
		
		boolean allergy = true;
		boolean peanut = true;
		boolean lactose = false;
		boolean bee = true;
		
		if(!allergy) {
			System.out.println("You are healthy.");
		}else {
			if(peanut) {
				System.out.println("Dot't eat peanut");
			}
			if(lactose) {
				System.out.println("Dot't drink milk");
			}
			if(bee) {
				System.out.println("Dot't mess with bees");
			}
		}
	}
}
