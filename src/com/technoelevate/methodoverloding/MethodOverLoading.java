package com.technoelevate.methodoverloding;

public class MethodOverLoading {
	public static void login(String username, String password) {
		System.out.println("Your Username is " + username);
		System.out.println("Your Password is " + password);
	}

	public static void login(long phno, String password) {
		System.out.println("Ph No. is " + phno);
		System.out.println("Your Password is " + password);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login("siddhesh1815", "qwerty@1234567");
		System.out.println();
		login(838096280, "qwerty@1234567");
	}

}
