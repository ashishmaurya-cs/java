package com.ashish;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Ajeet");
		ll.add("Anoop");
		ll.addLast("prabhat");
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	//	ll.remove(0);
	//ll.removeFirst();
		//ll.removeLast();
		
		//printing reverse order 
		Iterator<String> itr2=ll.descendingIterator();
		while(itr2.hasNext()){
		System.out.println(itr2.next());
		}

	}

}
