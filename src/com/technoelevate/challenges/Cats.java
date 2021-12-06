package com.technoelevate.challenges;



import java.util.Scanner;

public class Cats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string_arr[];
		String str = "ZERO ONE TWO THREE FOUR FIVE SIX SEVEN EIGHT NINE";
		string_arr = str.split(" ");
		int number[] = {0,1,2,3,4,5,6,7,8,9};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		System.out.println("Result = "+string_arr[num]);
		
	}

}
