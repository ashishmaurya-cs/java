package com.ashish;

public class ConstructorOverloading {
	int age;
	String name;
	public ConstructorOverloading() {
		age=23;
		name="Ashish";
	}
	public ConstructorOverloading(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void display(){
		System.out.println(name+" "+age);
	}
	
	public static void main(String[] args) {
		ConstructorOverloading c= new ConstructorOverloading();
		c.display();
		ConstructorOverloading c1= new ConstructorOverloading("Ashutosh", 5);
		c1.display();
	}

}
