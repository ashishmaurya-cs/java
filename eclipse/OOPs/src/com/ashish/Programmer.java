package com.ashish;

class Employee {
	float salary =10000.0f;
}

public  class Programmer extends Employee{
int bonus =1000;
	public static void main(String[] args) {
		Programmer p =new Programmer();
		System.out.println("Programmer salray is : "+p.salary);
		System.out.println("Bonus is : "+p.bonus);

	}

}
