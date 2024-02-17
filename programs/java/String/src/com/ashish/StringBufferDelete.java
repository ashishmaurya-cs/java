package com.ashish;

public class StringBufferDelete {


	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("Java");
		sb.delete(0, 2);
		System.out.println(sb);
		//long startTime=System.currentTimeMillis();
		//System.out.println((System.currentTimeMillis()-startTime));

	}

}
