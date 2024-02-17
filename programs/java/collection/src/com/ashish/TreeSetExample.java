package com.ashish;


import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		System.out.println("This is the example of treeset");
		TreeSet<Integer> s=new TreeSet<Integer>();
		s.add(90);
		s.add(80);
		s.add(70);
		
		s.forEach(a->{
			System.out.println(a);
		});
		System.out.println("Highest Value : "+s.pollFirst());
		System.out.println("Lowest Value : "+s.pollLast());
		
	}

}
