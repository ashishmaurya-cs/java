package com.ashish;

import java.util.Iterator;
import java.util.LinkedList;

public class Student {
	int roll;
	String name;
	int age;
 public Student(int roll,String name,int age){
	 this.roll= roll;
	 this.name=name;
	 this.age=age;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(100, "Anoop", 21);
		Student s2=new Student(101, "Ajeet",22);
		Student s3= new Student(102, "prabhat", 22);
		LinkedList<Student> ll=new LinkedList<Student>();
		ll.add(s1);
		ll.add(s2);
		ll.add(s3);
		Iterator<Student> itr=ll.iterator();
		while(itr.hasNext()){
			Student s= itr.next();
			System.out.println(s.roll+" " +s.name+" "+s.age);
		}
		

	}

}
