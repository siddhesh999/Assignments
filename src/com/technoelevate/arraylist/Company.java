package com.technoelevate.arraylist;


import java.util.ArrayList;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employees> list = new ArrayList<Employees>();
		list.add(new Employees(1, "sardar khan", 99999999));
		list.add(new Employees(2, "faisal khan", 99990000));
		for (Employees e : list) {
			System.out.println(e);
		}
		list.add(new Employees(1, "ramadhir singh..", 2000000000));
		for (Employees e : list) {
			System.out.println(e);
		}
	}

}
