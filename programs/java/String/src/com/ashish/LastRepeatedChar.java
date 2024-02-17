package com.ashish;

import java.util.Scanner;

public class LastRepeatedChar {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		s=s.toLowerCase();
		s=s.replace(" ", "");
		//int last=1;
		System.out.println(s);
		char[] ch=s.toCharArray();
		int count=0;
		for(int i=ch.length-1;i>0;i--){
			for(int j=i-1;j>=0;j--){
				if(ch[i]==ch[j]){
					count++;
					break;
					}
			}
			if(count==1){
				System.out.println("Last repeated character is :-"+ch[i]);
			}
		}
		
		sc.close();
	}

}
