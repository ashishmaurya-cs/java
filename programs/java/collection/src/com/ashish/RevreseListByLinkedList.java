package com.ashish;

import java.util.Iterator;
import java.util.LinkedList;

public class RevreseListByLinkedList {
	
	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("Ashish");
		l.add("Ajeet");
		l.add("Anoop");
		Iterator<String> itr=l.descendingIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
