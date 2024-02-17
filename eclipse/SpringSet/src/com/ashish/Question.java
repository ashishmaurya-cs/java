package com.ashish;

import java.util.Iterator;
import java.util.Set;

public class Question {
	private int id;
	private String question;
	private Set<String> answer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Set<String> getAnswer() {
		return answer;
	}
	public void setAnswer(Set<String> answer) {
		this.answer = answer;
	}
	void display(){
		System.out.println(id+" "+question);
		Iterator<String> itr=answer.iterator();
		itr.forEachRemaining(a->{
			System.out.println(a);
		});
	}

}
