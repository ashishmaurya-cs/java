package com.ashish;

import java.util.ArrayList;
import java.util.List;

public class ConsumerInterface {
	
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<>();
		
		for(int i=0;i<50;i++){
			list.add(i);
		}
		
		//Consumer<Integer> c;
		
		list.forEach(r->{
			System.out.println(r);
		});
	}

}
