package com.ashish;

import java.util.List;
import java.util.Vector;

public class ForLoopIteration {
	public static void main(String[] args) {
		List<String> l=new Vector<String>();
		l.add("Ashish");
		l.add("Anoop");
		//angular is a generic bracket
		l.add("Ajeet");
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
	}
}
