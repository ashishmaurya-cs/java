package com.ashish;

public class StudentData {
	int rollNo;
	String name;
	StudentData(){
		int rollNo=10;
		String name="Ajeet";
		System.out.println(rollNo+" "+name);
	}
	
	StudentData(int r,String n){
		rollNo=r;
		name=n;
	}
	
	void display(){
		System.out.println("Roll Number is :"+rollNo);
		System.out.println("Name is :"+name);
	}
	public static void main(String[] args) {
		new StudentData();
		
		
		StudentData s2=new StudentData(20, "Ashish");
		s2.display();
		
	}
	
}

