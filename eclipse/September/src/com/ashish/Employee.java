package com.ashish;

public class Employee {
	int empId;
	String name;
	Address address;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	void display(){
		System.out.println(empId+"\t"+name+"\t"+address);
	}
}
