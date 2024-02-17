package com.ashish;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionMap {
	int questionId;
	String question;
	Map<String, String> answers;
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
	public Map<String, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}
	
	public void display(){
		System.out.println(questionId+" "+question);
		Set<Entry<String,String>> set=answers.entrySet();
		Iterator<Entry<String, String>> itr=set.iterator();
		while(itr.hasNext()){
			Entry<String, String> entry=itr.next();
			System.out.println( entry.getKey()+" ,"+entry.getValue());
		}
	}
}
