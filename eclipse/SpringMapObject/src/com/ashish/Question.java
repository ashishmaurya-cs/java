package com.ashish;

public class Question {
	private int questionId;
	private String Question;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", Question=" + Question + "]";
	}
	

}
