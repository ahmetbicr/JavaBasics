package com.syntax.class08;

import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {

		// We are playing a lottery game and the lucky number is 17; We want to keep
		// asking the user to enter any numbers from 1-20; until he guesses the lucky
		// number --> In that case we print "Congrats, you won!"
		// You can try to solve it with do-while or while, whichever is the best
		// choice...

		Scanner scan = new Scanner(System.in);

		int luckyNumber = 17;

		int guess;
		do {
			System.out.println("Please enter any numbers from 1-20");
			guess = scan.nextInt();
			if (luckyNumber == guess) {
				System.out.println("Congrats, you won!");
			}
		} while (luckyNumber != guess);
	}
}