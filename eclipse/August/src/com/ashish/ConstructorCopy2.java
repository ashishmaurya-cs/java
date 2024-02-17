package com.ashish;

public class ConstructorCopy2 {
	String name;
	int age;
	
	public ConstructorCopy2() {
		// TODO Auto-generated constructor stub
	}
	public ConstructorCopy2(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	void display(){
		System.out.println(name+" "+age);
	}
	
	public static void main(String[] args) {
		ConstructorCopy2 c= new ConstructorCopy2("Ashish",23);
		ConstructorCopy2 c1=new ConstructorCopy2();
		c1.name=c.name;
		c1.age=c.age;
		c.display();
		c1.display();
	}

}
