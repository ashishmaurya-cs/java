package com.ashish;

public class CallByValue {
	int data=50;
	void change(int data){
		data=data+100;
		System.out.println(data);
	}
	public static void main(String[] args){
	CallByValue  c =new CallByValue();
	System.out.println("before change "+ c.data);//non-static variable
	c.change(500);
	System.out.println("After change "+c.data);//non static variable
	}

}
