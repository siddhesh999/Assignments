package com.technoelevate.empmgtsys;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeniorDeveloper developer = new SeniorDeveloper(new Employee("Rakshit", 250000, "Senior Devoloper"));
		System.out.println(developer.getId());
		System.out.println(developer.getName());
		

	}

}
