package com.ashish;

import java.util.Scanner;

public class ReverseWordString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to reverse a word:-");
		String s=sc.nextLine();
		String[] stringArray=s.split(" ");
		
		String toReverse=stringArray[0];
		String reversed="";
		 for(int i=toReverse.length()-1;i>=0;i--){
			reversed=reversed+s.charAt(i);
		}

	  	StringBuffer sb= new StringBuffer(s);
		//sb.delete(0, toReverse.length());
		//sb.insert(0, reversed);
		sb.replace(0, 6, reversed);
		System.out.println(sb);
		sc.close();
	 

	}

}
