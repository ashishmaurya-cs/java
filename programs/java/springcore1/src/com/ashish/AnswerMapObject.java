package com.ashish;

public class AnswerMapObject {
	int id;
	String answer;
	String postedDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(String postedDate) {
		this.postedDate = postedDate;
	}
	@Override
	public String toString() {
		return "AnswerMapObject [id=" + id + ", answer=" + answer + ", postedDate=" + postedDate + "]";
	}
	

}
