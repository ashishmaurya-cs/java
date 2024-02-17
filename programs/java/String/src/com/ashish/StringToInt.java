package com.ashish;

import java.util.Scanner;

public class StringToInt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to Convert into  int");
		String s=sc.next();
		
		for (int i=0;i<s.length();i++) {
			int n=s.charAt(i);
			System.out.println(n);
		}
		sc.close();
	}
}
