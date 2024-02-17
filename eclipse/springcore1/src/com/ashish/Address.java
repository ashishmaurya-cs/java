package com.ashish;

public class Address {
	String addressline;
	String city;
	String state;
	public String getAddressline() {
		return addressline;
	}
	public void setAddressline(String addressline) {
		this.addressline = addressline;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String toString() {
		return "Address [addressline=" + addressline + ", city=" + city + ", state=" + state + "]";
	}
	

}
