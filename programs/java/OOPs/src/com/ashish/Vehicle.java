package com.ashish;
//This is example of Abstract class.
 abstract public class Vehicle {
	abstract void start();
 }
	
  class Car extends Vehicle{
	 
	 void start(){
		 System.out.println("Car start with key...");
	 }
 }
  
 class  Scooter extends Vehicle{
	  
	  void start(){
		  
		System.out.println("Scotter start with kick...");  
	  }
	  public static void main(String[] args) {
		Scooter s = new Scooter();
		Car c = new Car();
		s.start();
		c.start();
	}	  
	  
  }

 

