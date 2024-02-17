package com.ashish;
import java.util.Scanner;

class P{
	String name;
	int rollno;
	void get(){
		System.out.println("Enter name and rollno");
		Scanner sc =new Scanner(System.in);
		 name=sc.next();
		 rollno = sc.nextInt();
		 sc.close();
	}
	void display(){
		System.out.println(name+ " " + rollno);
	}
}
public class Student {
	public static void main(String[] args){
		P p=new P();
		p.get();
		p.display();
	
	}

}
