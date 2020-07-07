package com.syntax.class17;

public class TaskTest {

	public static void main(String[] args) {

		Task task = new Task();

		String mail = task.createEmail("John", "Snow", "gmail");
		System.out.println(mail);

		System.out.println("--------------------------------");

		boolean numberIsPrime = task.isPrime(2363);

		if (numberIsPrime) {
			System.out.println("This number is Prime number");
		} else {
			System.out.println("This number is NOT Prime number");
		}

		Student student = new Student();

		char grade = student.getGrade(90);
		System.out.println(grade);

	}
}
