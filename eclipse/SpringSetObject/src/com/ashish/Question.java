package com.ashish;

import java.util.Set;

public class Question {
	private int id;
	private String question;
	private Set<Answer> answer;
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
	public Set<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(Set<Answer> answer) {
		this.answer = answer;
	}
	
	void display(){
		System.out.println(id+question);
		answer.forEach(a->{
			System.out.println(a);
		});
	}

}
