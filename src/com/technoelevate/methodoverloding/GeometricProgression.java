package com.technoelevate.methodoverloding;

import java.util.Scanner;

public class GeometricProgression {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int n=sc.nextInt();
			for(int j=0;j<n;j++) {
				a+=b;
				if (j>0) {
					System.out.println(" ");
				}
				System.out.println(a);
				b=b*2;
			}
			System.out.println("");
		}
	}

}
