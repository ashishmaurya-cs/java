package com.ashish;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String>  l=new ArrayList<String>();
		l.add("2");
		l.add("Ashish");
		Iterator<String> itr= l.iterator();//.iterator for iterate element.
		while(itr.hasNext()){
			System.out.println( itr.next());
			}
		//print direct elemkent.
		System.out.println(l);
		//iterate using for each
		for(String s:l){
			System.out.println(s);
		}

	}

}
