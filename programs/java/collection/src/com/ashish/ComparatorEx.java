package com.ashish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorEx {
	public static void main(String[] args) {
		ArrayList<Student2> list =new ArrayList<>();
		list.add(new Student2(1, "Ashish", 10));
		list.add(new Student2(2, "Ajeet", 21));
		list.add(new Student2(3, "Prabhat", 20));
		System.out.println("Sorting by age :-");
		Collections.sort(list, new AgeComparator());
		list.forEach(a ->{
			System.out.println(a.rollno+" "+a.name+" "+a.age);
		});
		
		System.out.println("Sorting by name :-");
		Collections.sort(list,new NameComparator());
		Iterator<Student2> itr=list.iterator();
		itr.forEachRemaining(a ->{
			System.out.println(a.rollno+" "+a.name+" "+a.age);
		});
	}

}
