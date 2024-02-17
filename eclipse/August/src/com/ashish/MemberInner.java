package com.ashish;

public class MemberInner {
	int data =100;
	class Inn{
		void messae(){
			System.out.println(data);
		}
	}
	
	public static void main(String[] args) {
		MemberInner m=new MemberInner();
		MemberInner.Inn i=m.new Inn();
		i.messae();
		
	}
}
