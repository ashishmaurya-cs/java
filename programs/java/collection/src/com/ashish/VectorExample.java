package com.ashish;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> v= new  Vector<>();
		v.add("Ashish");
		v.add("Ayush");
		v.add("Anoop");
		Iterator<String> itr= v.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
