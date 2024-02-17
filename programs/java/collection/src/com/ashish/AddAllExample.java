package com.ashish;

import java.util.ArrayList;
import java.util.Iterator;

public class AddAllExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al= new ArrayList<String>();
al.add("Ashish");
al.add("prab hat");
al.add("maurya");
Iterator<String> itr= al.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
}
System.out.println("Seconds list");
ArrayList<String> al2=  new ArrayList<>();
al2.add("Akshay");
al2.add("Amit");
Iterator<String> itr2= al2.iterator();
while(itr2.hasNext()){
	System.out.println(itr2.next());
}
System.out.println();
al.addAll(al2);
Iterator<String> itr3=al.iterator();
while(itr3.hasNext()){
	System.out.println(itr3.next());
}
	}

}
