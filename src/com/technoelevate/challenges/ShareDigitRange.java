package com.technoelevate.challenges;

import java.util.Scanner;

public class ShareDigitRange {

	public static boolean hasSharedDigit(int number){
			int last_digitnumber = number%10;
			number/=10;
			if(number==last_digitnumber){
				return true;
			}
			else{
				return false;
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		if(number<99 && number>9 ){
			boolean result = hasSharedDigit(number);
			if(result){
				System.out.println("Has same digit");
			}
			else{
				System.out.println("Not have same digit");
			}
		}
		
		
		
		
	}

}
