package com.technoelevate.loopingstmts;

public class EvenOddusingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, n = 100;
		do {
			if (a % 2 == 0) {
				System.out.println(a + " is an Even Number...");
			} else {
				System.out.println(a + " is an Odd Number...");
			}
			a++;
			
		} while (a <= n);
	}

}
