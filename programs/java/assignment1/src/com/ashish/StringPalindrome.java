package com.ashish;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String to check whether it is palindrome or not");
		String s=sc.nextLine();
		String s1="";
		String s2=s;
		for(int i=s.length()-1;i>=0;i--){
			s1=s1+s.charAt(i);
		}
		if(s2.equals(s1)){
			System.out.println("It is palindrome");
		}
		else{
			System.out.println("not a palindrome");
		}
		sc.close();
	}

}
