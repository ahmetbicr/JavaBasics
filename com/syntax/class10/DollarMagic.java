package com.syntax.class10;

public class DollarMagic {

	public static void main(String[] args) {

		// Let's print The Dollar
		// $$$$
		// $  $
		// $  $
		// $  $
		// $$$$

		for (int r = 1; r <= 5; r++) { // The outer loop controls the rows

			for (int c = 1; c <= 4; c++) { // The inner loop controls the columns

				if (r == 1 || r == 5) { // In the first or last row print every $
					System.out.print("$");
				} else { // In the other rows

					if (c == 1 || c == 4) { // In the first or last column print $
						System.out.print("$");
					} else { // In the other columns print +
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
		// HW Redo this task without using nested if
		// Hint: You should use logical && + ||
	}
}
