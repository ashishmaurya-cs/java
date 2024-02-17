package com.ashish;

import java.util.Iterator;
import java.util.Set;


public class QuestionSet {
 int questionId;
 String question;
 Set<String> answers;
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
public Set<String> getAnswers() {
	return answers;
}
public void setAnswers(Set<String> answers) {
	this.answers = answers;
}
 public void display(){
	 System.out.println(questionId+" "+question);
	 Iterator<String> itr=answers.iterator();
	 while(itr.hasNext()){
		 System.out.println(itr.next());
	 }
 }
}
