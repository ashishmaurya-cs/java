package com.ashish;

public class StaticMethodInterface {
	
	interface A{
		static void display(){
			System.out.println("Static method is called...");
		}
	}
	 public static void main(String[] args) {
		A.display();
	}
}
