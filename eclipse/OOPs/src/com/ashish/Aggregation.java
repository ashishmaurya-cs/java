package com.ashish;

public class Aggregation {
	
	int student_id;
	String name;
	Address address;
	
	public Aggregation(int student_id,String name,Address address){
		this.student_id = student_id;
		this.name = name;
		this.address = address;
		
	}
	
	void display(){
		
		System.out.println(student_id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}
	
	public static void main(String[] args) {
		
		Address addresss = new Address("GKP" ,"UP" , "INDIA");
		Address addresss2 = new Address("BASTI","UP","INDIA");
		
		Aggregation a =new Aggregation(110,"rahul",addresss);
		Aggregation a2 =new Aggregation(111,"Ramesh",addresss2);
		
		a.display();
		a2.display();
		
	}

}
