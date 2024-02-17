package com.ashish;

import java.util.Scanner;

public class FirstCharacterDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String  to find out duplicate array:-");
		String s=sc.nextLine();
		s=s.toLowerCase();
		//System.out.println(s);
		char[] ch=s.toCharArray();
		int firstCount=0;
		for(int  i=0;i<ch.length;i++){
			int count=1;
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]==ch[j]){
					count++;
					ch[j]='0';
				}
			}
			if(count>1&&ch[i]!='0'&&firstCount==0){
				System.out.println("First Character duplicate is : "+ch[i]);
				firstCount++;
			}
			
		}
		sc.close();
	}

}
