package com.ashish;

public class AnswerMapObject {
	private String ans;
	private String postedBy;
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	@Override
	public String toString() {
		return "AnswerMapObject [ans=" + ans + ", postedBy=" + postedBy + "]";
	}
	
}
