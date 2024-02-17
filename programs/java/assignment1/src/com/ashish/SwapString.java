package com.ashish;

import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two string");
		String s1=sc.next();
		String s2=sc.next();
		System.out.println("Before swaping :- "+s1+" "+s2);
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("After  swaping :- "+s1+" "+s2);
		sc.close();

	}

}
