package com.ashish;

import java.util.Scanner;

public class FrequencyCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:-");
		String s=sc.nextLine();
		int[] a=new int[26];
		int[] b =new int[26];
		for(int i=0;i<=s.length()-1;i++){
			if(s.charAt(i)>=65&&s.charAt(i)<=90){
				a[(int)(s.charAt(i))-65]++;//downcasting
			}
			
				if(s.charAt(i)>=97&&s.charAt(i)<=122){
					b[s.charAt(i)-97]++;
				}
		}
		for(int i=0;i<=25;i++){
			if(a[i]>0){
				System.out.println((char)(i+65) +":- "+ a[i] + " times");//upcasting
				}
			if(b[i]>0){
				System.out.println((char)(i+97) +":- "+ b[i] + " times");
			}
		}
		
		sc.close();
	}

}
