package com.ashish;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ForEachRemaining {
public static void main(String[] args) {
	List<String> l=new LinkedList<String>();
	l.add("Ashish");
	l.add("Ajeet");
	l.add("Anoop");
	Iterator<String> itr=l.iterator();
	itr.forEachRemaining(a->{
		System.out.println(a);
	});
}
}
