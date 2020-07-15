package com.syntax.class22_1;

import com.syntax.class22.Employee;

public class WaterFallTeam extends Employee {

	public void slowWork() {

	}

	public static void main(String[] args) {

		WaterFallTeam wt = new WaterFallTeam();
		WaterFallTeam.company = "Instagram";
		wt.fullName = "John Snow"; // protected variable is accessible to different package through inheritance
	}
}
