package com.syntax.class18;

public class Students {

	// Create a Class called Students
	// Create three variables studentName , studentID and numberOfStudents
	// Create three objects of the Students Class
	// Set the value for studentName , studentID and increment the numberOfStudents
	// for each object
	// Print out total number of students

	String studentName;
	int studentID;
	static int numberOfStudents = 0;

	public static void main(String[] args) {

		Students student1 = new Students();
		student1.studentName = "Ahmet";
		student1.studentID = 95734;
		numberOfStudents++;

		Students student2 = new Students();
		student2.studentName = "Lucy";
		student2.studentID = 53747;
		numberOfStudents++;

		Students student3 = new Students();
		student3.studentName = "Smith";
		student3.studentID = 74653;
		numberOfStudents++;

		System.out.println("Number of students: " + numberOfStudents);

	}

}
