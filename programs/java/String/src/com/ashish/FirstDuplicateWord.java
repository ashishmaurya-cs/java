package com.ashish;

import java.util.Scanner;

public class FirstDuplicateWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to find out  first duplicate word");
		String s=sc.nextLine();
		s=s.toLowerCase();
		String[] words=s.split(" ");
		int counterFirst=0;
		
		for(int i=0;i<words.length;i++){
			int count=1;
			for(int j=i+1;j<words.length;j++){
				if(words[i].equals(words[j])){
					count++;
					words[j]="";
					}
				
				
			}
			if((count>1&&words[i]!="")&&counterFirst==0){
				System.out.println(words[i]+" "+count);
				counterFirst++;
				}
		
		
		}
	sc.close();

	}

}
