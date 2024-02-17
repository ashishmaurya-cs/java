package com.ashish;


import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter striong to find out length");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		int i=0;
		//for(char c:s.toCharArray(); or
		for( char c:ch){
			i++;
		}
		System.out.println("Length of entered styring :-  "+i);
		sc.close();
	}

}