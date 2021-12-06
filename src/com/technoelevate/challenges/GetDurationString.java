package com.technoelevate.challenges;


import java.util.Scanner;

public class GetDurationString {
	public static String getDurationString(double minute , int second){
		int hour = 0;
		int min = 0;
		String time;
		if(minute>=0 && second>=0 &&second<=59){
			hour = (int)minute/60;
			min =(int) minute-(hour*60);
			time=hour+"hr "+min+"min "+second+"sec";
			return time;
		}
		else
			return "Invalid data";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter minutes");
		int minute = scan.nextInt();
		System.out.println("Enter seconds");
		int seconds = scan.nextInt();
		String time = getDurationString(minute, seconds);
		System.out.println("Time in hr:min:sec format = "+time);
	}
}
