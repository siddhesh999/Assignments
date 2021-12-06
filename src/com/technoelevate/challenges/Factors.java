package com.technoelevate.challenges;


public class Factors {

	public static void printFactors(int number) {

		if (number < 1) {
			System.out.println("Invalid Value");
		}

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		Factors factors = new Factors();
		factors.printFactors(0);
	}
}

