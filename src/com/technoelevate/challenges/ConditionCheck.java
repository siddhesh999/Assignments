package com.technoelevate.challenges;



public class ConditionCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int count = 0;
		System.out.print("Number which are divided by 3 & 5 are: ");
		for(int i=1; i<=1000; i++){
			if(i%3==0 && i%5==0){
				System.out.print(i+" ");
				
				sum+=i;
				count++;
				if(count==5){
					break;
				}
			}
		}
		System.out.println("\nSum = "+sum);
		
	}

}
