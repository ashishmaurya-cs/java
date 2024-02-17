package com.ashish;

public class CounterWithoutStatic {
	int count=0;
	
	void display(){
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		CounterWithoutStatic c= new CounterWithoutStatic();
		CounterWithoutStatic c1= new CounterWithoutStatic();
		c.display();
		c1.display();
	}
}
