package com.ashish;

import java.util.Iterator;
import java.util.List;

public class QuestionList {
int questionId;
String question;
List<String> answers;
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
public List<String> getAnswers() {
	return answers;
}
public void setAnswers(List<String> answers) {
	this.answers = answers;
}
 public void display(){
	 System.out.println(questionId +" "+question);
	 Iterator<String> itr=answers.iterator();
	 while(itr.hasNext()){
		 System.out.println(itr.next());
	 }
 }
}
