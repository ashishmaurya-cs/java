package com.ashish;

import java.util.Scanner;

public class WordDuplicate {
	public static void main(String[] args) {
		System.out.println("Enter String to find out word duplicate:-");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine(); 
	//	int firstCount=0;
		String[] words=s.toLowerCase().split("\\s");
		
		for(int i=0;i<words.length;i++){
			int count=1;
			for(int j=i+1;j<words.length;j++){
				if(words[i].equals(words[j])){
					count++;
					//firstCount++;
					words[j]="0";
					
				}
			}
			if(count>1&&words[i]!="o"){
				System.out.println(words[i]+" "+count);
				break;
			}
		}
		sc.close();
	}

}
