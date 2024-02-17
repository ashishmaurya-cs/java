package com.ashish;

import java.util.Scanner;

public class StringLngth {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		int i=0;
		for ( char c:s.toCharArray()) {
			i++;
			
		}
		System.out.println(i);
		sc.close();
	}

}
