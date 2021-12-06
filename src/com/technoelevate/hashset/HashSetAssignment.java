package com.technoelevate.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetAssignment {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(99);
		set.add(88);
		set.add(77);
		set.add(44);
		set.add(55);
		set.add(67);
		set.add(58);
		set.add(64);
		for (Integer i : set) {
			System.out.println(i);
		}
		System.out.println("=====================");
		Iterator<Integer> iterator = set.iterator();
		//Over-riding Iterator methods.
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
