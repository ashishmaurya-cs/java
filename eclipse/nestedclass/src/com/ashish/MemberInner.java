package com.ashish;

import com.ashish.MemberInner;

public class MemberInner {
	private int num=20;
	class InnerMember{
		void display(){
			System.out.println("num :- "+num);
		}
	}
	
	public static void main(String[] args) {
		MemberInner mem=new MemberInner();
		MemberInner.InnerMember in=mem.new InnerMember();
		in.display();
		
	}

}

