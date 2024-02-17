package com.ashish;

import java.util.Scanner;

public class RevrseFirstWordString {
	
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		String[] words=s.split(" ");
		String firstWord=words[0];
		int l=firstWord.length();
		System.out.println(firstWord);
		String rev="";
		for(int i=firstWord.length()-1;i>=0;i--){
			rev=rev+firstWord.charAt(i);
		}
		System.out.println("After revrse : "+rev);
		
		StringBuffer sb=new StringBuffer(s);
		sb.replace(0, l, rev);
		System.out.println(sb);
		sc.close();
	}

}
