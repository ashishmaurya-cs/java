package com.ashish;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionMap {
	private int questionId;
	private String question;
	private Map<String, String> answers;
	public QuestionMap(int questionId, String question, Map<String, String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	
	public void display(){
		System.out.println(questionId+question);
		
		Set<Entry<String, String>> set=answers.entrySet();
		Iterator<Entry<String, String>> itr=set.iterator();
		while (itr.hasNext()) {
			Entry<String, String> entry=itr.next();
			System.out.println(entry.getKey()+entry.getValue());
		}
	}

}
