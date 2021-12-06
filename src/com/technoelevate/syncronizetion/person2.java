package com.technoelevate.syncronizetion;

public class person2 extends Thread {
	EpsonPrinter printer;

	public person2(EpsonPrinter printer) {
		super();
		this.printer = printer;
	}

	@Override
	synchronized public void run() {
		for (int i = 1; i <= 2; i++) {
			System.out.println(i);
		}
		System.out.println("person2 Your prints are done");
	}

}
