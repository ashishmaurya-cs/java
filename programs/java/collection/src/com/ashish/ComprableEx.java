package com.ashish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComprableEx {
	public static void main(String[] args) {
		ArrayList<Student1> list=new ArrayList<>();
		list.add(new Student1(1,"Ashish",20));
		list.add(new Student1(2, "Ajeet", 21));
		list.add(new Student1(3, "Anoop", 19));
		
		Collections.sort(list);
		Iterator<Student1> itr=list.iterator();
		
		while(itr.hasNext()){
			Student1 s=itr.next();
			System.out.println(s.rollno+" "+s.name+" "+s.age);
		}
	}
}
