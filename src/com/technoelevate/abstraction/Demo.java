package com.technoelevate.abstraction;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass class1 = new SubClass();
		class1.drink();
		class1.eat();
		class1.sleep();
		System.out.println("=========================");
		System.out.println("Upcasting");
		System.out.println();
		Cat ab = class1;// up casting
		ab.drink();
		ab.eat();
		ab.sleep();
		Cat.test();
		System.out.println(Cat.x);
	}

}
