package com.ashish;

public class Constructor {
	
	int rollno;
	String name;
	Constructor(){
		
		rollno=30;
		name="Ram Ashish Maurya";
	}
	
	Constructor(int r,String name){
		rollno=r;
		this.name=name;
	}
	void display(){
		
		System.out.println(name + " " +rollno);
	
	}
	public static void main(String[] args){
		Constructor c= new Constructor();//default constructor
		c.display();
		Constructor c2=new Constructor(10,"Ajeet");//parameterize constructor
		c2.display();
	}

}
