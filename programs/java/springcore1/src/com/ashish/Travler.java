package com.ashish;

public class Travler implements Journey {
	private Vehicle v;

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}
	public void startJourney(){
		System.out.println("Journey started");
		v.move();
	}

}
