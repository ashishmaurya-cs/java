package com.ashish;

public class StudentPojo {
	private int roll;
	private String name;
	private int mark;
	public StudentPojo(int roll, String name, int mark) {
		super();
		this.roll = roll;
		this.name = name;
		this.mark = mark;
	}
	
	public StudentPojo() {
		// TODO Auto-generated constructor stub
	}

	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "StudentPojo [roll=" + roll + ", name=" + name + ", mark=" + mark + "]";
	}
	
	

}
