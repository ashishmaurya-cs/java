package com.ashish;

public class ReferenceMatching {

	public static void main(String[] args) {
		String s1="Ashish";
		String s2="Ashish";
		String s3 =new String("Ashish");
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false coz it created in heap area

	}

}
