package com.ashish;

public class LocalInner {
	int data=10;
	void display(){
		class Loal{
			void ms(){
				System.out.println(data);
			}
		}
		Loal l=new Loal();
		l.ms();
	}
	
	public static void main(String[] args) {
		LocalInner l =new LocalInner();
		l.display();
	}
}
