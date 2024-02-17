package com.ashish;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> s= new Stack<>();
		s.push("Ashish");
		s.push("Amit");
		s.push("Anmol");
		s.pop();
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());//output is Ashish Amit ,coz top of the stack is removed by pop method and 
			//it return rest of the element
		}
	}

}
