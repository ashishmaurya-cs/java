package com.ashish;

public class Bus implements Vehicle{
	private int maxSpeed;

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public void move() {
		System.out.println("Max Speed"+maxSpeed);
		System.out.println("Bus Started");
		
	}
	
}
