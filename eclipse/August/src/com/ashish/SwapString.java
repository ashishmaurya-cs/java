package com.ashish;

import java.util.Scanner;

public class SwapString {
  
	public static void main(String[] args) {
		System.out.println("Enter two String gor swaping");
		Scanner sc= new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
	
		System.out.println("Value before swaqping is :-" +s1+" "+s2);
		s1=s1+s2;
		
		
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("After swaping the string is :-" +s1+" "+s2);
		sc.close();
	}
}
