package com.ashish;

public class CounterWithStatic {
	static int count=0;
	public CounterWithStatic() {
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		new CounterWithStatic();
		new CounterWithStatic();
		new CounterWithStatic();
	}

}
