package com.ashish;

import java.util.ArrayList;
import java.util.List;

public class StreamApi {
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		for(int i=1;i<=10;i++){
			list.add(i);
		}
		list.parallelStream().forEach(a-> System.out.println(a));
	}

}
