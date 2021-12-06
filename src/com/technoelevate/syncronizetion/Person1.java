package com.technoelevate.syncronizetion;


public class Person1 extends Thread {

	EpsonPrinter printer;

	public Person1(EpsonPrinter printer) {
		super();
		this.printer = printer;
	}

	@Override
	synchronized public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		System.out.println("Person1 Your prints are done");
	}
}