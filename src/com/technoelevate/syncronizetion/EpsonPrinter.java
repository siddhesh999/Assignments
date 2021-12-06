package com.technoelevate.syncronizetion;

public class EpsonPrinter {
	int pages;

	public EpsonPrinter(int pages) {
		super();
		this.pages = pages;
	}

	public void print(int pages) {
		if (pages > 0) {
			this.pages += pages;
		}
	}

	public void printed() {
		System.out.println(pages);
	}
}
