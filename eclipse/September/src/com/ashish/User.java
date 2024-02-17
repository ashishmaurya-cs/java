package com.ashish;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class User {
	private Map<QuestionMapObject,AnswerMapObject> map;

	public Map<QuestionMapObject, AnswerMapObject> getMap() {
		return map;
	}

	public void setMap(Map<QuestionMapObject, AnswerMapObject> map) {
		this.map = map;
	}
	
	public void display(){
		Set<Entry<QuestionMapObject,AnswerMapObject>> set=map.entrySet();
		Iterator<Entry<QuestionMapObject,AnswerMapObject>> itr=set.iterator();
		while(itr.hasNext()){
		Entry<QuestionMapObject, AnswerMapObject> entry= itr.next();
		QuestionMapObject ques=entry.getKey();
		AnswerMapObject ans=entry.getValue();
		System.out.println(ques+" "+ans);
		}
		
	}
	
}
