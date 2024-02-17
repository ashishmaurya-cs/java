package com.ashish;

public class AnswerSet {
	private int id;
	private String answers;
	private String by;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	public String getBy() {
		return by;
	}
	public void setBy(String by) {
		this.by = by;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answers=" + answers + ", by=" + by + "]";
	}
	

}
