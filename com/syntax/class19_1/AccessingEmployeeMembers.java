package com.syntax.class19_1;

// to import shortcut is cmd+shift+o
import com.syntax.class19.Employee;

public class AccessingEmployeeMembers {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.lastName = "Oliva"; // accessing public variables
		emp.name = "Luis"; // accessing public variables

//		emp.age --> protected not visible
//		emp.salary --> default not visible
//		emp.ssn --> private not visible

		emp.displayName();

	}
}
