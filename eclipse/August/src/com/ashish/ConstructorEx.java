package com.ashish;

public class ConstructorEx {
	String name;
	int age;
	public ConstructorEx(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	void display(){
		System.out.println(name+" "+age);
	}
	
	public static void main(String[] args) {
		ConstructorEx c= new ConstructorEx("Ashish", 23);
		c.display();
	}

}
