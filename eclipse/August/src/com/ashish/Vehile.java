package com.ashish;

public class Vehile {
	
void run(){
	System.out.println("Vehile is running.");
}

}

class Bikess extends Vehile{
	void run(){
		System.out.println("Bike is running,");
	}
	
	public static void main(String[] args) {
		Bikess b=new Bikess();
		b.run();
	}
}
