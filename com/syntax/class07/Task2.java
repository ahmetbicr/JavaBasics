package com.syntax.class07;

public class Task2 {

	public static void main(String[] args) {

		// Create a boolean variable workDay and assign true create int variable day and
		// assign it to 1
		// ●As long as it is workDay print “I need a day off” and increase day.
		// ●Once day is 6 print “I do not need a day off any more”

		boolean workDay = true;
		int day = 1;

		// WRONG WAY BECAUSE IT SAYS AS LONG AS IT IS WORKDAY
//		while (day <= 6) {
//			if (day == 6) {
//				workDay = false;
//			}
//			if (workDay) {
//				System.out.println("I need a day off");
//			} else {
//				System.out.println("I do not need a day off any more");
//			}
//			day++;
//		}

		while (workDay) {
			if (day < 6) {
				System.out.println("I need a day off");
				day++;
			} else {
				System.out.println("I do not need a day off any more");
				workDay = false;
			}
		}

		// 2nd way

//		while (workDay && day <= 6) {
//			if (day < 6) {
//				System.out.println("I need a day off");
//			} else {
//				System.out.println("I do not need a day off any more");
//				workDay = false;
//			}
//			day++;
//		}

	}
}
