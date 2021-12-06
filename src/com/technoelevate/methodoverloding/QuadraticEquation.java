package com.technoelevate.methodoverloding;

import java.util.Scanner;

public class QuadraticEquation {

	double a,b,c,d,r1,r2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		QuadraticEquation quadraticEquation = new QuadraticEquation();
		System.out.println("Enter the value of a -:");
		quadraticEquation.a = sc.nextDouble();
		System.out.println("Enter the value of b -:");
		quadraticEquation.b = sc.nextDouble();
		System.out.println("Enter the value of c -:");
		quadraticEquation.c = sc.nextDouble();
		quadraticEquation.d = (quadraticEquation.b * quadraticEquation.b) - 4.0 * quadraticEquation.a * quadraticEquation.c;
		if (quadraticEquation.d > 0.0) {
			quadraticEquation.r1 = (-quadraticEquation.b + Math.pow(quadraticEquation.d, 0.5)) / (2.0 * quadraticEquation.a);
			quadraticEquation.r2 = (-quadraticEquation.b - Math.pow(quadraticEquation.d, 0.5)) / (2.0 * quadraticEquation.a);
			System.out.println("The Roots are " + quadraticEquation.r1 + " and " + quadraticEquation.r2);
		} else if (quadraticEquation.d == 0) {
			quadraticEquation.r1 = -quadraticEquation.b / (2.0 * quadraticEquation.a);
			System.out.println("The Root is -: " + quadraticEquation.r1);
		} else {
			System.out.println("The Roots are Not Real...");
		}

	}

}
  