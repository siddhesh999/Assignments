package com.technoelevate.methodoverloding;



public class MethodOverloading2 {
	public static void add(int x, int y) {
		System.out.println(x + y);
	}

	public static void add(int x, int y, int z) {
		System.out.println(x + y + z);
	}
public static void name(int x) {
	System.out.println(x);
}
public static void name(double x) {
	System.out.println(x);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(2, 3);
		add(5, 9, 7);
		name('s');
	}

}
