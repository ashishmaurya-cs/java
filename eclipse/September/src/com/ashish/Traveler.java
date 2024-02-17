package com.ashish;

public class Traveler implements Journey{
	private Vehicle v;

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}

	@Override
	public void startJourney() {
		System.out.println("Start Journey");
		v.move();
		
	}
	
	
}
