package com.ashish;

import java.util.Collections; 
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//int[] a = new int[3];
		List<Integer> list = new LinkedList<Integer>();
		
			list.add(2);
			list.add(8);
			list.add(3);
			list.add(20);
			list.add(11);
			
			Collections.sort(list);
	
		System.out.println(list);
		/*for(int i:list){
			System.out.println(i);
		}*/
		
		ListIterator<Integer> itr =list.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		sc.close();
	}
	
}
