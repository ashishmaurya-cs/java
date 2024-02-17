package com.ashish;

public class Answer {

	private String ans;
	private String By;
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public String getBy() {
		return By;
	}
	public void setBy(String by) {
		By = by;
	}
	@Override
	public String toString() {
		return "Answer [answer=" + ans + ", By=" + By + "]";
	}
	
	
}
