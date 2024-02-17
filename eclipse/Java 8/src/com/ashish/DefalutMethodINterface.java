package com.ashish;

interface Aa{
	void display();
	default void show(){
		System.out.println("Hi  ,default method.");
	}
	
	
}

class B implements Aa{

	@Override
	public void display() {
		System.out.println("Display method called..");
		
	}
	
}

public class DefalutMethodINterface {
	public static void main(String[] args) {
		B b = new B();
		b.display();
		b.show();
	}
}
