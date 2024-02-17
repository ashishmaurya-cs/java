package com.ashish;

import java.util.Iterator;
import java.util.Set;

public class QuestionSet {
	private int questionId;
	private String question;
	private Set<String> answers;
	public QuestionSet(int questionId, String question, Set<String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	
	public void display(){
		System.out.println(questionId+question);
		Iterator<String> itr=answers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}

}
