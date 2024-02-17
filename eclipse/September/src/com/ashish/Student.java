package com.ashish;

public class Student {
	int roll;
	String name;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void display(){
		System.out.println(roll);
		System.out.println(name);
	}
	
}
