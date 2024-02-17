package com.ashish;

public class Employee {
	 float salary=20000.0f;
}

class Guard extends Employee{
	int bounus=2000;
	
	public static void main(String[] args) {
		Guard g=new Guard();
		System.out.println(g.salary);
		System.out.println(g.bounus);
	}
}
