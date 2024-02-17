package com.ashish;

public class Aggregation {
	int empId;
	String name;
	Address address;
	public  Aggregation(int empId,String name,Address address){
		this.empId=empId;
		this.name=name;
		this.address=address;
	}
	
	void display(){
		System.out.println(empId+" "+name);
		System.out.println(address.city+" "+address.state);
	}
	
	public static void main(String[] args) {
		
		Address a1= new Address("GKP", "UP");
		Aggregation a = new Aggregation(100, "Ashish", a1);
		a.display();
	}
}
