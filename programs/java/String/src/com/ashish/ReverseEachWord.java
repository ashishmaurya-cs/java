package com.ashish;

import java.util.Scanner;

public class ReverseEachWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  string to reverse each word");
		String s=sc.nextLine();
		String[] words=s.split("\\s");
		//another logic for reverse word as well as string 
		for(int i=0;i<words.length;i++){
			String word=words[i];
			String rev="";
			for(int j=word.length()-1;j>=0;j--){
				rev=rev+word.charAt(j);
			}
			System.out.print(rev+" ");
		}
		sc.close();
	}

}
