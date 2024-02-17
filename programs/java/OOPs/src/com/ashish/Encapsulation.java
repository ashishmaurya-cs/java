package com.ashish;

public class Encapsulation {
	private int student_id;
	
	void setStudent_id(int student_id){
		
		this.student_id = student_id;
	}
	
	void getStudent_id(){
		System.out.println(student_id);
	}

	public static void main(String[] args) {
		Encapsulation e= new Encapsulation();
		e.setStudent_id(101);
		e.getStudent_id();

	}

}
