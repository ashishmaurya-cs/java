package com.ashish;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class User {

	private Map<Question,Answer> user;

	public Map<Question, Answer> getUser() {
		return user;
	}

	public void setUser(Map<Question, Answer> user) {
		this.user = user;
	}
	void display(){
		Set<Entry<Question,Answer>> set=user.entrySet();
		Iterator<Entry<Question,Answer>> itr=set.iterator();
		while(itr.hasNext()){
			Entry<Question,Answer> entry=itr.next();
			Question q=entry.getKey();
			Answer a=entry.getValue();
			System.out.println(q+" "+a);
		}
		
	}

}
