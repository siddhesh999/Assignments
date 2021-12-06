package com.technoelevate.methodoverloding;

import java.util.Scanner;

public class NumberTable {
	static int prod, sum, range;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of your Choice -: ");
		int num = sc.nextInt();
//		System.out.print("Enter the Range -: ");
//		range = sc.nextInt();*/
		for (int i = 1; i <= 10; i++) {
			prod = num * i;
			System.out.println(num + " * " + i + " = " + prod);
			sum = sum + prod;
			
		}
		System.out.println("The Sum is -: " + sum);
	}

}
