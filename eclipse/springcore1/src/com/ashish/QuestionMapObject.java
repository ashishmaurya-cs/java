package com.ashish;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionMapObject {
	int id;
	String name;
	private Map<AnswerMapObject,UserMapObject> answers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<AnswerMapObject, UserMapObject> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<AnswerMapObject, UserMapObject> answers) {
		this.answers = answers;
	}
	public void display(){
		System.out.println("Question id : "+id);
		System.out.println("Question name : "+name);
		System.out.println("Answers .....");
		Set<Entry<AnswerMapObject,UserMapObject>> set=answers.entrySet();
		Iterator<Entry<AnswerMapObject,UserMapObject>> itr=set.iterator();
		while(itr.hasNext()){
			Entry<AnswerMapObject, UserMapObject> entry=itr.next();
			AnswerMapObject ans=entry.getKey();
			UserMapObject user=entry.getValue();
			System.out.println("Answer information..");
			System.out.println(ans);
			System.out.println("Posted By :");
			System.out.println(user);
		}
	}
	

}
