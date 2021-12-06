package com.technoelevate.empmgtsys;


public class ManualTestEngineer extends Tester {
	private String designation;

	ManualTestEngineer(Employee employee) {

	}

	ManualTestEngineer(String designation) {
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
