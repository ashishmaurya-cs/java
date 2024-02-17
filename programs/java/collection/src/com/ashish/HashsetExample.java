package com.ashish;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {
		HashSet<String> hs= new HashSet<String>();
		hs.add("Ashish");
		hs.add("Ashish");
		hs.add("Maurya");
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
