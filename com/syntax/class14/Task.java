package com.syntax.class14;

import java.util.Scanner;

public class Task {

//		Accept username, password and confirm password from a user and check following requirements:
//
//		1.	Username or Password cannot be  empty, if so→ message=“Username or Password cannot be empty”.
//		2.	Password should be minimum 8 characters, if less → message=“Password is too short”.
//		3.	Password cannot contain username if so, → message=“Password cannot contain username”.
//		4.	Password should match confirmed password, if not  → message=“Passwords do not match”.
//
//		Only after all requirements met → message “Your username and password has been created”

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		System.out.println("Please enter user name");
//		String username = scan.nextLine();
//		System.out.println("Please enter password");
//		String password = scan.nextLine();
//		System.out.println("Please confirm the password");
//		String confirmPassword = scan.nextLine();
//
//		if (username.isEmpty() || password.isEmpty()) {
//			System.out.println("Username or Password cannot be empty");
//		} else if (password.length() < 8) {
//			System.out.println("Password is too short");
//		} else if (password.contains(username)) {
//			System.out.println("Password cannot contain username");
//		} else if (!password.equals(confirmPassword)) {
//			System.out.println("Passwords do not match");
//		} else {
//			System.out.println("Your username and password has been created");
//		}

//		System.out.println("Please enter user name");
//		String username = scan.nextLine();
//		System.out.println("Please enter password");
//		String password = scan.nextLine();
//
//		if (username.isEmpty() || password.isEmpty()) {
//			System.out.println("Username or Password cannot be empty");
//		} else {
//
//			if (password.length() >= 8) {
//
//				if (!password.contains(username)) {
//					System.out.println("Please confirm the password");
//					String confirmedPassword = scan.nextLine();
//
//					if (password.equals(confirmedPassword)) {
//						System.out.println("Your username and password has been created");
//					} else {
//						System.out.println("Passwords do not match");
//					}
//				} else {
//					System.out.println("Password cannot contain username");
//				}
//			} else {
//				System.out.println("Password is too short");
//			}
//		}
		// HW continue asking user for username & password until all all requirement are
		// met and credentials are created

		boolean isItDone = false;
		do {
			System.out.println("Please enter user name");
			String username = scan.nextLine();
			System.out.println("Please enter password");
			String password = scan.nextLine();

			if (username.isEmpty() || password.isEmpty()) {
				System.out.println("Username or Password cannot be empty");
			} else {

				if (password.length() >= 8) {

					if (!password.contains(username)) {
						System.out.println("Please confirm the password");
						String confirmedPassword = scan.nextLine();

						if (password.equals(confirmedPassword)) {
							System.out.println("Your username and password has been created");
							isItDone = true;
						} else {
							System.out.println("Passwords do not match");
						}
					} else {
						System.out.println("Password cannot contain username");
					}
				} else {
					System.out.println("Password is too short");
				}
			}
		} while (!isItDone);
		
		scan.close();
	}
}
