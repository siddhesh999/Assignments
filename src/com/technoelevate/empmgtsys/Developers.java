package com.technoelevate.empmgtsys;

public abstract class Developers extends Employee {
	{
		System.out.println("Number of Developers :" + Employee.count++);
	}

	abstract public void work();
}
