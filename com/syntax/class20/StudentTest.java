package com.syntax.class20;

public class StudentTest {

	public static void main(String[] args) {
		
		Students student1 = new Students("Smith", 70, 80, 83);
		Students student2 = new Students("Adam", 49, 23, 94);
		Students student3 = new Students("Lucy", 98, 53, 45);
		Students student4 = new Students("Mary", 78, 15, 0);
		Students student5 = new Students("Ahmet", 67, 89, 99);
		
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
		student4.displayInfo();
		student5.displayInfo();
		
	}
}
