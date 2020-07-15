package com.syntax.class22;

public class Employee {

	public static String company;
	protected String fullName;
	double salary;
	private long ssn;

	void work() {
		System.out.println("Employee works");
	}

	void getPaid() {
		System.out.println("Employee gets paid");
	}
}

class ScrumTeam extends Employee {

	String ceremonies;

	void attendsMeetings() {
		System.out.println("Attends meeting");
	}

	void workOnBuildingSoftware() {
		System.out.println("Works on building software");
	}

}

class ProductOwner extends ScrumTeam {

	void communicate() {
		System.out.println("Gets requirements from BA");
	}

	void prioritizePB() {
		System.out.println("Prioritizes product backlog");
	}
}

class ScrumMaster extends ScrumTeam {

	void shieldTeam() {
		System.out.println("Scrum master is shielding the team");
	}

	void doMeetings() {
		System.out.println("Scrum master is doing meetings");
	}
}

class Developer extends ScrumTeam {

	void code() {
		System.out.println("Developer is coding");
	}
}

class Tester extends ScrumTeam {

	void test() {
		System.out.println("Tester is testing");
	}

}

class BusinessAnalyst extends ScrumTeam {

	void gatherRequirements() {
		System.out.println("Business analyst gathering requirements");
	}
}
