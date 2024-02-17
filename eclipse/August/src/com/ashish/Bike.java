package com.ashish;


 abstract public class Bike {
	 void run(){
		 System.out.println("Bike is runnin...");
	 }
}
 
 class Bajaj extends Bike{
	 public static void main(String[] args) {
		 Bajaj b =new Bajaj();
		 b.run();
	}

	@Override
	void run() {
		System.out.println("Bajaj baike is runnin...");
		
	}
 }
