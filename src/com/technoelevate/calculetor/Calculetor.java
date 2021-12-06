package com.technoelevate.calculetor;

import java.util.Scanner;

class Calculator {

	String sc;
	double num1, num2;

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("1] Addition");
		System.out.println("2] Subtraction");
		System.out.println("3] Multiplication");
		System.out.println("4] Division");
		System.out.println("5] G.S.T");
		System.out.print("Enter your Choice -:");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Addition");
			System.out.print("Enter the 1st Number:- ");
			calculator.num1 = sc.nextDouble();
			System.out.print("Enter the 2nd Number:- ");
			calculator.num2 = sc.nextDouble();
			System.out.println("Result => " + calculator.add(calculator.num1, calculator.num2));
			break;
		case 2:
			System.out.println("Subtractiontion");
			System.out.print("Enter the 1st Number:- ");
			calculator.num1 = sc.nextDouble();
			System.out.print("Enter the 2nd Number:- ");
			calculator.num2 = sc.nextDouble();
			System.out.println("Result => " + calculator.sub(calculator.num1, calculator.num2));
			break;
		case 3:
			System.out.println("Multiplication");
			System.out.print("Enter the 1st Number:- ");
			calculator.num1 = sc.nextDouble();
			System.out.print("Enter the 2nd Number:- ");
			calculator.num2 = sc.nextDouble();
			System.out.println("Result => " + calculator.mult(calculator.num1, calculator.num2));
			break;
		case 4:
			System.out.println("Division");
			System.out.print("Enter the 1st Number:- ");
			calculator.num1 = sc.nextDouble();
			System.out.print("Enter the 2nd Number:- ");
			calculator.num2 = sc.nextDouble();
			System.out.println("Result => " + calculator.div(calculator.num1, calculator.num2));
			break;
		case 5:
			System.out.println("G.S.T");
			System.out.print("Enter the Percentage:- ");
			calculator.num1 = sc.nextDouble();
			System.out.print("Enter the Original Price:- ");
			calculator.num2 = sc.nextDouble();
			System.out.println("Result => " + calculator.gst(calculator.num1, calculator.num2) + " /- Rs only");
			break;
		default:
			System.out.println("Invalid Out-Put...");
			break;
		}
		System.out.println("Do you want to Continue?");
		System.out.println("y or n.");
		char ch = sc.next().charAt(0);
		if (ch == 'y') {
			main(null);
		} else {
			// final String ESC="\0332[";
			// System.out.println("\033[H\033[2J");
			System.exit(0);
		}

	}

	public double add(double a, double b) {
		double sum = a + b;
		return sum;
	}

	public double sub(double a, double b) {
		double sub = a - b;
		return sub;
	}

	public double mult(double a, double b) {
		double mult = a * b;
		return mult;
	}

	public double div(double a, double b) {
		double div = a / b;
		return div;
	}

	public double gst(double perc, double original_price) {
		double gst = (original_price + (original_price * perc / 100));
		return gst;
	}

}

