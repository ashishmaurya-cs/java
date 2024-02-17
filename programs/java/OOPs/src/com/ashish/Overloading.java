package com.ashish;

/*
public class Overloading {
	
	void pen(){
		System.out.println("This is a pen.");
		
	}
	
	void pen(int a){
		
		System.out.println(a);
	}
 public static void main(String[] args) {      //this is the example of overloading by change argument.
	Overloading o = new Overloading();
	
	o.pen();
}
}  */


public class  Overloading{
	void salary(float a){
		
		
		System.out.println(a);
	}
	
	void salary(int b){
		
		
	
		
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.salary(100);
	}
	
}