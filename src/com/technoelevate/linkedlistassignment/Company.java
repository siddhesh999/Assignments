package com.technoelevate.linkedlistassignment;


import java.util.Collections;
import java.util.LinkedList;

public class Company  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Employee> list = new LinkedList<Employee>();
		list.add(new Employee(2, "Daffy Duck", 99999999));
		list.add(new Employee(3, "Goofy Gophers", 989898988));
		list.add(new Employee(1, "Lola Bunny", 9999997));
		list.add(new Employee(4, "bunny", 4445454));
		for (Employee e : list) {
			System.out.println(e);
		}
		System.out.println("Comparable	");
		System.out.println("===============");
		Collections.sort(list);
		for(Employee e:list) {
			System.out.println(e);
		}
		System.out.println("Comparator");
		System.out.println("===============");
		Collections.sort(list,new NameSorting());
		for(Employee e: list) {
			System.out.println(e);
		}
	}

}
