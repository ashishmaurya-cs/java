package com.ashish;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharHashMap {
public static void main(String[] args) {
	String str = "Ashish";
	
    Map<Character, Integer> hashMap = new HashMap<Character,Integer>();

   
    char[] words = str.toCharArray();

    for (char c : words) {
        Integer integer = hashMap.get(c);

        if (integer == null){
            hashMap.put(c, 1);
        }

        else {
            hashMap.put(c, integer + 1);
        }
    }
    
    for(Map.Entry<Character,Integer> entry:hashMap.entrySet()){
    	if(entry.getValue()>1)
    	System.out.println(entry.getKey()+ " : "+entry.getValue());
    }
}
}
