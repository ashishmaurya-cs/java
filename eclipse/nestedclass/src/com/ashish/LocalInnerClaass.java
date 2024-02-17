package com.ashish;

public class LocalInnerClaass {
	private int num=100;
	void display(){
		class Local{
			
			void message(){
				System.out.println(num);
			}
		}
		Local l=new Local();
		l.message();
	}
	
	public static void main(String[] args) {
		LocalInnerClaass l=new LocalInnerClaass();
		l.display();
	}

}
