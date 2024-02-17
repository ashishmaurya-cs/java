package com.ashish;

public class StringBufferEnsureCapacity {
	public static void main(String[] args){
		StringBuffer sb= new StringBuffer("Ashish");
	System.out.println(sb.capacity());
	sb.ensureCapacity(25);//after this step capacity is old*2+2; i.e. 22*2+2=46
	
	System.out.println(sb.capacity());
	}
}
