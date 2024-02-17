package com.ashish;

public class StringBufferCapacity {

	public static void main(String[] args) {
			StringBuffer sb=  new StringBuffer();
			
			System.out.println(sb.capacity());//16
			sb.append("HEllo java is very cool ");
			System.out.println(sb.capacity());//34
	}

}
