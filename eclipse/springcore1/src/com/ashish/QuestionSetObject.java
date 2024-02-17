package com.ashish;

import java.util.Iterator;
import java.util.Set;

public class QuestionSetObject {

	private int id ;
	private  String question;
	private Set<AnswerSet> answers;
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
	
	
	public Set<AnswerSet> getAnswers() {
		return answers;
	}
	public void setAnswers(Set<AnswerSet> answers) {
		this.answers = answers;
	}
	void display(){
		System.out.println(id+"\t"+question);
		
		Iterator<AnswerSet> itr=answers.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}
