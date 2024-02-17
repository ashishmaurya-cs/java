package com.ashish;

import java.util.Scanner;

public class WordDuplicate {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String");
		String s= sc.nextLine();
		s=s.toLowerCase();
		String[] words=s.split(" ");
		int count;
		for(int i=0;i<words.length;i++){
			 count=1;
			
			for(int j=i+1;j<words.length;j++){
				
				if(words[i].equals(words[j])){
					count++;
					words[j]="0";
				}
			}
			
			if(count>1&&words[i]!="0"){
				System.out.println(words[i]+" "+count);
			}
		}
		sc.close();
	}

}
