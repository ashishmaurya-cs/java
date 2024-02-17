package com.ashish;

public class Student {
	private int roll;
	private String name;
	public Student(){
		System.out.println("SPPPPP");
	}
	public Student(int roll){
		this.roll=roll;
	}
	
	public Student(String name){
		this.name=name;
	}
	public Student(int roll, String name) {
		
		this.roll = roll;
		this.name = name;
	}
	
	public void display(){
		System.out.println(roll+ name);
	}

}
