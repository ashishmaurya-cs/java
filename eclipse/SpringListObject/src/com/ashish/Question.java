package com.ashish;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String question;
	private List<Answer> answer;
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
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	 void display(){
		 System.out.println("Id :"+id+" "+"Question  is : "+question);
		 Iterator<Answer> itr=answer.iterator();
		 while(itr.hasNext()){
			 Answer a=itr.next();
			 String ans=a.getAnswer();
			 String by=a.getBy();
			 System.out.println(ans+" "+by);
			 
		 }
	 }

}
