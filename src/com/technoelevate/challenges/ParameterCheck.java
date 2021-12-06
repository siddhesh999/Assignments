package com.technoelevate.challenges;

import java.util.Scanner;

public class  ParameterCheck{

	public static double areaOfCircle(double radius){
		double result;
		if(radius>0){
			result = 3.14*radius*radius;
			return result;
		}
		else 
			return -1;
	}
	
	public static double areaOfRectangle(double length, double breath){
		double result;
		if(length > 0 && breath > 0){
			result = length*breath;
			return result;
		}
		else 
			return -1;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		for(;;){
			System.out.println("Enter number of parameters");
			System.out.println("Enter 3 to enter");
			int arg = scan.nextInt();
			
			if(arg == 1){
				System.out.println("Enter value");
				double num1 = scan.nextDouble();
				System.out.println("Area of circle = "+areaOfCircle(num1));
			}
			else if(arg == 2){
				System.out.println("Enter 1st value");
				double num1 = scan.nextDouble();
				System.out.println("Enter second value");
				double num2 = scan.nextDouble();
				System.out.println("Area of rectangle = "+areaOfRectangle(num1, num2));
			}
			else if(arg == 3){
				break;
			}
			else{
				System.out.println("Enter valid data");
			}
		}
	}
	
}
