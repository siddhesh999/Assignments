package com.technoelevate.linkedlist;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashLinkedSet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(85);
		linkedHashSet.add(96);
		linkedHashSet.add(74);
		linkedHashSet.add(41);
		linkedHashSet.add(52);
		linkedHashSet.add(63);
		linkedHashSet.add(45);
		linkedHashSet.add(56);
		linkedHashSet.add(34);
		Iterator<Object> iterator = linkedHashSet.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
	}

}
