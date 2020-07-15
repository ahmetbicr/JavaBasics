package com.syntax.class22_1;

import com.syntax.class22.Employee;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp = new Employee();
		Employee.company = "Google";

//		new ScrumTeam(); not available because it is default class.
//		new Cat();

		WaterFallTeam wt = new WaterFallTeam();
		WaterFallTeam.company = "Amazon";

	}
}
