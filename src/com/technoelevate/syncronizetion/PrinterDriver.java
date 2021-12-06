package com.technoelevate.syncronizetion;

public class PrinterDriver {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		EpsonPrinter printer = new EpsonPrinter(0);
		Person1 person1 = new Person1(printer);
		person2 person2 = new person2(printer);
		person1.start();
		person2.start();
		person1.join();
		person2.join();
		System.out.println("Executed");
		printer.printed();
	}

}
