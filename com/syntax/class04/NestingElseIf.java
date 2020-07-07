package com.syntax.class04;

public class NestingElseIf {

	public static void main(String[] args) {
		// if student completed the quiz we'll check the score
		// if score >= 90 --> A, Great Job!
		// if score >= 80 --> B, Well done!
		// if score >= 70 --> C, Just passed!
		// otherwise --> F, You failed!
		//
		// if student didn't completed the quiz, please finish your quiz!

		boolean quiz = true;

		if (quiz) {
			int score = 88;

			if (score >= 90) {
				System.out.println("A, Great Job!");
			} else if (score >= 80) {
				System.out.println("B, Well done!");
			} else if (score >= 70) {
				System.out.println("C, Just passed!");
			} else {
				System.out.println("F, You failed!");
			}
		} else {
			System.out.println("Please finish your quiz!");
		}

	}
}
