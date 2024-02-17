package com.ashish;

public class Vehicle {
	void run(){
		System.out.println("Runnin....");
	}
}

class Car extends Vehicle{
	void run(){
		System.out.println("Car is runnin...");
	}
	public static void main(String[] args) {
		Car c= new Car();
		c.run();
	}
}
