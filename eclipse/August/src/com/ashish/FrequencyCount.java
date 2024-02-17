package com.ashish;

import java.util.Scanner;

public class FrequencyCount {
	public static void main(String[] args) {
		System.out.println("Enter string to count frequency of characters");
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		//char[] c= s.toLowerCase().toCharArray();
		int[] a=new int[26];
		int[] b=new int[26];
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>=65&&s.charAt(i)<=90){
				a[s.charAt(i)-65]++;
			}
			
			if(s.charAt(i)>=97&&s.charAt(i)<=122){
				b[s.charAt(i)-97]++;
			}
		}
		
		
		
		for(int i=0;i<=25;i++){
			if(a[i]>1){
				System.out.println((char)(i+65)+" "+"Count is :-"+a[i]);
			}
			if(b[i]>1){
				System.out.println((char)(i+97)+" "+"Count is :-"+b[i]);
			}
		}
	}

}
