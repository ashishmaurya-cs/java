package com.ashish;


import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("Ashish"); 
		ll.add("Ajeet");
		ll.add("Anoop");
		ll.add("Amit");
		
		ListIterator<String> litr=ll.listIterator();
		
	System.out.println("forword direction");
	while(litr.hasNext()){
		System.out.println("Index: "+litr.nextIndex()+" Values : "+litr.next());
	}
	System.out.println("backword direction");
	while(litr.hasPrevious()){
		System.out.println("Index : "+litr.previousIndex()+" Value : "+litr.previous());
	}
	}

}
