package com.ashish;

public class Overriding {
	
	void animal(){
	
	System.out.println("This is the overreden method:");
    }
}

class Overriding1 extends Overriding{
	
 void animal(){//	protected
		System.out.println("This is a dog....barking");
		
	}
	public static void main(String[] args) {
		Overriding1 o =  new Overriding1();
		o.animal();
	}
	
}
