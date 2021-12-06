//Write a method named area with one double parameter named radius. 
//The method needs to return a double value that represents the area of a circle.If the parameter radius is negative then return -1.0 to represent an invalid value.Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
//The method needs to return an area of a rectangle.If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
package com.technoelevate.challenges;
import java.util.Scanner;

public class CalculateAreaOfCircle {
	public static double areaOfCircle(double radius){
		double result;
		if(radius>0){
			result = 3.14*radius*radius;
			return result;
		}
		else 
			return -1;
	}
	
	public static double areaOfCircle(double length, double breath){
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
		System.out.println("Enter number of parameters");
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
			System.out.println("Area of rectangle");
		}
		else{
			System.out.println("Enter valid data");
		}
		
	}

}
