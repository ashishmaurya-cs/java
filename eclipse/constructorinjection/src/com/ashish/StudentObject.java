package com.ashish;

public class StudentObject {
	private int roll;
	private String name;
	private Address address;
	public StudentObject(int roll, String name, Address address) {
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	
	public void display(){
		System.out.println(roll+name+address);
	}
	
}
