package com.ashish;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LambdaExpressionEx {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Iterator<Integer> itr=list.iterator();
		itr.forEachRemaining((a)->{
			System.out.println(a);
		});
	}
	

}
