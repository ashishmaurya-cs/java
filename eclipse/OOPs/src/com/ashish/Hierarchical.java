package com.ashish;

public class Hierarchical extends Animal {

	void multiLion(){
		System.out.println("this is a lion in hierarchical..");
		
	}
	
	public static void main(String []args){
		Hierarchical h = new Hierarchical();
		h.eat();
		h.multiLion();
		
		
	}
	
}
