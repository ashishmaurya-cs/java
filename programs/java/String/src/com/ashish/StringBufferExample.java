package com.ashish;

public class StringBufferExample {

	public static void main(String[] args) {
   StringBuffer sb = new StringBuffer();
   
   System.out.println(sb.capacity());
   sb.append("Hello ");
   System.out.println(sb.capacity());
   System.out.println(sb.append(" java is my favourite language"));
   System.out.println(sb.capacity());
	
	}
}
