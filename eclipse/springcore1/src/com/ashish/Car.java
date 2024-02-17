package com.ashish;

public class Car  implements Vehicle{
	private String fuelType;
	private String maxSpeed;
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void move(){
		System.out.println("Car Started");
		System.out.println("Fuel type "+fuelType);
		System.out.println("Max speed "+maxSpeed);
	}
}
