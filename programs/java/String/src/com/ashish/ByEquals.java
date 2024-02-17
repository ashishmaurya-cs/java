package com.ashish;

public class ByEquals {
	public static void main(String[] args){
		String s1="Ashish";
		String s2="Ashish";
		String s3=new String("Ashish");
		String s4="Maurya";
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s4));//check only content all   false
		String s5="maurya";
		System.out.println(s4.equals(s5));//false
		System.out.println(s4.equalsIgnoreCase(s5));//true
	}

}
