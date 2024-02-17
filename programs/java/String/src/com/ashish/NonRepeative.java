package com.ashish;

import java.util.Scanner;

public class NonRepeative {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to print non-repeative word");
		String s= sc.nextLine();
		s=s.toLowerCase();
		String[] words=s.split(" ");
		for(int i=0;i<words.length;i++){
			int count=1;
			for(int j=i+1;j<words.length;j++){
				if(words[i].equals(words[j])){
					count++;
					words[j]="0";
				}
			}
			if(count==1&&words[i]!="0"){
				System.out.println(words[i]);
			}
			sc.close();
		}
	}

}
