package com.technoelevate.set;
public class Team {
	int num;
	String name;
	int age;
	static int count;
	int count1;

	public void check(int count1) {
		if (count1 > 11) {
			throw new CantBeAded("11 players are added Can't add Players ");
		}
	}

	public Team(int num, String name, int age) {
		super();
		count++;
		// count1 = count;
		this.num = num;
		this.name = name;
		this.age = age;
		// System.out.println(count);
		this.check(count);
	}

	@Override
	public String toString() {
		return "Team [num=" + num + ", name=" + name + ", age=" + age + "]";
	}

}
