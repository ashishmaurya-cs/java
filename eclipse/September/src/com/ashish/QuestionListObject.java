package com.ashish;

import java.util.Iterator;
import java.util.List;

public class QuestionListObject {
private int questionId;
private String question;
private List<Answer> answer;
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
public List<Answer> getAnswer() {
	return answer;
}
public void setAnswer(List<Answer> answer) {
	this.answer = answer;
}
public void display(){
	System.out.println(questionId+" "+question);
	Iterator<Answer> itr=answer.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}

}
