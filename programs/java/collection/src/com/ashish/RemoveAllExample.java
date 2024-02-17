package com.ashish;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveAllExample {

	public static void main(String[] args) {
	
			ArrayList<String> al= new ArrayList<String>();
			al.add("Ashish");
			al.add("prabhat");
			al.add("Anoop");
			ArrayList<String> al2= new ArrayList<>();
			al2.add("Ashish");
			al2.add("ajeet");
			al2.removeAll(al);//here only ashish is removed from al2
			Iterator<String>itr =al2.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());//o/p is ajeet
			}
			al.remove(0);
			// output is prabhat, ashish,coz first element is removed from al
			System.out.println(al);
			
			
	}

}
