package com.ashish;

import java.util.Iterator;
import java.util.Set;

public class QuestionSetObject {
	private int questionId;
	private String question;
	private Set<AnswerSetObject> answer;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Set<AnswerSetObject> getAnswer() {
		return answer;
	}
	public void setAnswer(Set<AnswerSetObject> answer) {
		this.answer = answer;
	}
	public void display(){
		System.out.println(questionId+" "+question);
		Iterator<AnswerSetObject> itr=answer.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
}
