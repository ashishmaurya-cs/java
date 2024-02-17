package com.ashish;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordHashmap {
	public static void main(String[] args) {
		String str = "Pradnya lives in Mumbai and Ashish lives in Gorakhpur";
		 
	    Map<String, Integer> hashMap = new HashMap<String,Integer>();

	   
	    String[] words = str.split(" ");

	    for (String word : words) {
	        Integer integer = hashMap.get(word);

	        if (integer == null){
	            hashMap.put(word, 1);
	        }

	        else {
	            hashMap.put(word, integer + 1);
	        }
	    }
	    
	    for(Map.Entry<String,Integer> entry:hashMap.entrySet()){
	    	System.out.println(entry.getKey()+ " : "+entry.getValue());
	    }
	}
}
