package com.ashish;

public class Overloading2 {
	void add(int a,int b){
		System.out.println(a+b);
	}
	 void add(long a,long b){
		 System.out.println(a+b);
	 }
	 
	 public static void main(String[] args) {
		Overloading2 o =new Overloading2();
		o.add(1, 2);
		o.add(4l, 6l);
	}
}
