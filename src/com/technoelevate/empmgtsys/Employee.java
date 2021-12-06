package com.technoelevate.empmgtsys;


public class Employee {
	private int eid;
	private String ename;
	private double esal;
	static int count;
	private String designation;
	{
		count++;
		System.out.println("Welcome");
	}

	Employee() {
	}

	public Employee(String ename, double esal, String designation) {
		super();
		this.eid = count;
		this.ename = ename;
		this.esal = esal;
		this.designation = designation;
	}

	public int getId() {
		return eid;
	}

	public String getName() {
		return ename;
	}

	public void setName(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return esal;
	}

	public void setSal(double esal) {
		this.esal = esal;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
}

