package com.ashish;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Ashish");
		map.put(2, "Prabhat");
		map.put(3, "Anoop");
		Set<Entry<Integer, String>> set=map.entrySet();
		Iterator<Entry<Integer, String>> itr=set.iterator();
		itr.forEachRemaining(a ->{
			System.out.println(a.getKey()+" "+a.getValue());
		});
	}

}
