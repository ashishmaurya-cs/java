


package com.ashish;

import java.util.Scanner;

public class ToggleEachWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string for toggle");
		String s=sc.nextLine();
		String[] words=s.split(" ");
		//String toggle="";
		for (String word : words) {
			String firstChar=word.substring(0,1);
			String remainChar=word.substring(1);
			String toggle=firstChar.toLowerCase()+remainChar.toUpperCase();
			System.out.println(toggle);
		}
		sc.close(); 
	}
}
