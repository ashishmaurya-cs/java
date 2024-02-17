package com.ashish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	int rollno;
	String name;
	String branch;
	
	public Student(int rollno,String name,String branch){
		this.rollno=rollno;
		this.name=name;
		this.branch=branch;
	}
	public int compareTo(Student o) {
	if(rollno==o.rollno){
	return 0;
	}
	else if (rollno>o.rollno){
		return 1;
	}
	else{
		return -1;
	}
}
}


public  class ComparableExample {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(3, "Ashish", "CS"));
		list.add(new Student(6, "Ajeet", "ME"));
		list.add(new Student(1, "Vivek", "CE"));
		
		Collections.sort(list);
		list.forEach(a->{
			Student s=(Student)a;
			System.out.println(s.rollno+s.name+" "+s.branch);
		});
		
	}
}
