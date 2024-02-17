package com.ashish;

import java.util.Scanner;

public class StartWith {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string :-");
	String s=sc.nextLine();
	String[] ch =s.split(" ");
	int i;
	System.out.println("Enter  Character by which start a word you want to print");
	String startwith=sc.next();
	for(i=0;i<ch.length;i++){
		if(ch[i].startsWith(startwith)){
			System.out.println(ch[i]);
			}
	}

	sc.close();
}
}
