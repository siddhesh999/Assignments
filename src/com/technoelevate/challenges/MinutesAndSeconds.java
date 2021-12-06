package com.technoelevate.challenges;

//1. Create a method called getDurationString with two parameters, 
//first parameter minutes and 2nd parameters seconds.
//- You should validate the first parameter minutes is >=0
//- you should also validate that the 2nd parameter seconds is >=0 and <=59.
//- The methods should return "invalid value" in the method
//if wither of the above are not true.
//-if the parameters are valid then calculate how many hours minutes and seconds
//equal the minutes and seconds passed to this method and return that value 
//as String in format "XXh YYm ZZs" where XX represents a number of hours,
//YY the minutes and ZZ the seconds.
//- Create a 2nd method if the same name but with only one parameter seconds.
//- validate that it is >=0, and return "invalid value " if it is not true.
//If it is valid then calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.
//- call both methods to print values to the console.

public class MinutesAndSeconds {

	public static void main(String[] args) {
		getDurationString(120, 58);
		getDurationString((7200));
	}

	public static String getDurationString(int minutes, int seconds) {
		if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
			int hours = minutes / 60;
			int remaingMinutes = (minutes % 60);
			String i = hours + " h " + remaingMinutes + " m " + seconds + " s";
			System.out.println(i);
			return i;
		} else
			return "invalid value";

	}

// 2nd method(overloading)
	public static String getDurationString(int seconds) {
		if (seconds >= 0) {
			int correctedMinutes = (seconds / 60);
			int correctedSeconds = seconds % 60;
			String i = correctedMinutes + " m " + correctedSeconds + " s";
			System.out.println(i + "\n" + getDurationString(correctedMinutes, correctedSeconds));

			return (i + "\n" + getDurationString(correctedMinutes, correctedSeconds));
		} else
			return "invalid value";

	}
}