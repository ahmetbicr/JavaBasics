package com.syntax.class18;

//Create a Class called Employee:
//Create three  variables  eID , salary and set the CEO to “Sumair” 
//Create two objects of the class Employee 
//Set the value of eID, salary for each of the objects
//Print out the eID , salary and  CEO for each of the objects
public class Employee {

	int empID;
	int salary;

	static String CEO = "Sumair";

	public static void main(String[] args) {

		System.out.println(Employee.CEO);

		// accessing static variables within SAME CLASS
		System.out.println(CEO);

		// accessing static method
		sayHelloToCeo();

		Employee emp1 = new Employee();
		emp1.empID = 20149404;
		emp1.salary = 100000;
		System.out.println("------ 1st employee -----");
		System.out.println("Employee ID = " + emp1.empID);
		System.out.println("Employee salary = " + emp1.salary);
		System.out.println("CEO is = " + Employee.CEO);

		Employee emp2 = new Employee();
		emp2.empID = 74372384;
		emp2.salary = 90000;
		System.out.println("------ 2nd employee -----");
		System.out.println("Employee ID = " + emp2.empID);
		System.out.println("Employee salary = " + emp2.salary);
		System.out.println("CEO is = " + Employee.CEO);
	}

	static void sayHelloToCeo() {
		System.out.println("Hi " + CEO);
	}
}
