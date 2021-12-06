package com.technoelevate.empmgtsys;


public class AutomationTestEngineer extends Tester {
	private String designation;

	AutomationTestEngineer(Employee employee) {

	}

	AutomationTestEngineer(String designation) {
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub

	}
}
