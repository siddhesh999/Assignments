package com.technoelevate.set;

import java.util.HashSet;

public class Cricket {
	public static void main(String[] args) {
		HashSet<Team> set1 = new HashSet<Team>();
		set1.add(new Team(1, "	Abraham Benjamin de Villiers", 37));
		set1.add(new Team(2, "	Yuzvendra Singh Chahal", 31));
		set1.add(new Team(3, "	Daniel Trevor Christian", 35));
		set1.add(new Team(4, "	Pavan Uday Deshpande", 32));
		set1.add(new Team(5, "	Glenn James Maxwell", 33));
		set1.add(new Team(6, "	Mohammed Siraj", 27));
		set1.add(new Team(7, "	Mohammed Azharuddeen",22));
		set1.add(new Team(8, "	Harshal Vikram Patel", 1));
		set1.add(new Team(9, "	Shahbaz Ahmed", 26));
		set1.add(new Team(10, "	Akash Deep", 24));
		set1.add(new Team(11, "	Timothy Hays David", 25));
		for (Team t : set1) {
			System.out.println(t);
		}
		set1.add(new Team(12, "Adam Zampa", 29));
		for (Team t : set1) {
			System.out.println(t);
		}
	}
}
