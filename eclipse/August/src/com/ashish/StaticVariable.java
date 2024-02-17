package com.ashish;

public class StaticVariable {
	String name;
	String collegeName="RKGEC";
	
	public StaticVariable(String name) {
		this.name=name;
	}

	
	void display(){
		System.out.println(name+" "+collegeName);
	}
	
	public static void main(String[] args) {
		StaticVariable s= new StaticVariable("Ashish Maurya ,");
		StaticVariable s1= new StaticVariable("Ashutosh Maurya ,");
		s.display();
		s1.display();
	}
}
