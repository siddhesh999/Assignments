package com.technoelevate.methodoverloding;


public class Recurssion {

	public int recur(int x) {
		@SuppressWarnings("unused")
		int prod=x;
		if (x==1) {
			return 1;
		}
		return prod=x*recur(--x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		Recurssion re=new Recurssion();
		System.out.println(re.recur(n));

	}

}
