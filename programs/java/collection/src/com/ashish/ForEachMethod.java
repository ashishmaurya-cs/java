package com.ashish;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethod {
	public static void main(String[] args) {
		//here i am using lambda expression
		List<String> l=new ArrayList<String>();
		l.add("Ashish");
		l.add("Ajeet");
		l.add("Anoop");
		l.forEach(a ->{
			System.out.println(a);
		});//it's new feature ,which come in java 8
	}
}
