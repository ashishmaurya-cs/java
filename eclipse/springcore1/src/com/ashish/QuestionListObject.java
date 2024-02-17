package com.ashish;

import java.util.Iterator;
import java.util.List;

public class QuestionListObject {
	private int id;
	private String question;
	private List<Answers> answers;
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
	public List<Answers> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}
	
	void display(){
		System.out.println(id +"\t"+question);
		
		Iterator<Answers> itr=answers.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
