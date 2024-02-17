package com.ashish;

public class Answer {
	private String answer;
	private String by;
	
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getBy() {
		return by;
	}

	public void setBy(String by) {
		this.by = by;
	}

	@Override
	public String toString() {
		return "Answer [answer=" + answer + ", by=" + by + "]";
	}
	

}
