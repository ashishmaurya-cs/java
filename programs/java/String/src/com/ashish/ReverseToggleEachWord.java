package com.ashish;

import java.util.Scanner;

public class ReverseToggleEachWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to reverse and toggle");
		String s=sc.nextLine();
		String[] words =s.split(" ");
		for (String ss : words) {
			String word=ss;
			String toggle=" ";
			String rev="";
			for(int i=word.length()-1;i>=0;i--){
				rev=rev+word.charAt(i);
			}
			String firstChar=rev.substring(0, 1);
			String remainChar=rev.substring(1);
			toggle=firstChar.toLowerCase()+remainChar.toUpperCase();
			System.out.print(toggle+" ");
		}
		sc.close();
	}
}
