package com.ashish;

public class ConstructorCopy1 {
	String name;
	int age;
	public ConstructorCopy1(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public ConstructorCopy1(ConstructorCopy1 c) {
		this.name=c.name;
		this.age=c.age;
	}
	
	void display(){
		System.out.println(name+" "+age);
	}
	
	public static void main(String[] args) {
		ConstructorCopy1 c=new ConstructorCopy1("Ashish", 23);
		ConstructorCopy1 c1=new ConstructorCopy1(c);
		c.display();
		c1.display();
	}
}
