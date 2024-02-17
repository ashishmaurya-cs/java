package com.ashish;

import java.util.Iterator;
import java.util.List;

public class QuestionList {
private int questionId;
private String question;
private List<String> answer;
public QuestionList(int questionId, String question, List<String> answer) {
	super();
	this.questionId = questionId;
	this.question = question;
	this.answer = answer;
}
public void display(){
	System.out.println(questionId+question);
	Iterator<String> itr=answer.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
		
	}
}
}
