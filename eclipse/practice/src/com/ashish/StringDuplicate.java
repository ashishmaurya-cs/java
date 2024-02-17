package com.ashish;

import java.util.Scanner;

public class StringDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String s=sc.nextLine();
		String[] words=s.toLowerCase().split("\\s");
		int count ;
		int firstCount=1;
		for(int i=0;i<words.length;i++){
			count =1;
			for(int j=i+1;j<words.length;j++){
				if(words[i].equals(words[j])){
					count++;
					words[j]=" ";
				}
				
			}
			if(count>1&&words[i]!=" "&&firstCount==1){
				System.out.println(words[i] +" "+count);
				firstCount++;
			}
		}
		sc.close();
	}

}
