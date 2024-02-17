package com.ashish;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string:");//program for reverse string
		String s=sc.nextLine();
		String s1="";
		for(int i=s.length()-1;i>=0;i--){
			s1=s1+s.charAt(i);
		}
		System.out.println("Reverse of string is :- "+s1);
		sc.close();
	}

}
