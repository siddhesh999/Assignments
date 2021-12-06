package com.technoelevate.loopingstmts;

public class PrimeNumbersUsingWhileloop {

	public static void main(String[] args) {

		int primeNumber;
		int n = 1;
		int divisibleCount;

		while (n <= 100) {
			divisibleCount = 0;
			primeNumber = 2;
			while (primeNumber <= n / 2) {
				if (n % primeNumber == 0) {
					divisibleCount++;
					break;
				}
				primeNumber++;
			}
			if (divisibleCount == 0 && n != 1) {
				System.out.println(n + " ");
			}
			n++;
		}

	}
}
