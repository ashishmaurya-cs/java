package com.ashish;

import java.util.Iterator;

public class LinkedHashSet {

	public static void main(String[] args) {
		java.util.LinkedHashSet<String> lhs= new java.util.LinkedHashSet<>();
		lhs.add("Ashish");
		lhs.add("Ashish");//print only one ashish coz it does not  allow duplicate in linkedhashset
		//it maintain insertion order
		lhs.add("Maurya");
		Iterator<String> itr=lhs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
