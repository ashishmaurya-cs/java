package com.ashish;

import java.util.ArrayList;
import java.util.Iterator;

public class RetainAllExample {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("Ashish");
		al.add("prabhat");
		al.add("Anoop");
		
		ArrayList<String> al2= new ArrayList<>();
		al2.add("Ashish");
		al2.add("ajeet");
		al.retainAll(al2);
		Iterator<String>itr =al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
