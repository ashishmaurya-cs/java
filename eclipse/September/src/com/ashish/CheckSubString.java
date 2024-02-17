package com.ashish;

import java.util.Scanner;

public class CheckSubString {
	public static void main(String[] args) {
		String s="I am a good boy";
		String[] a=s.split("\\s");
		Scanner sc= new Scanner(System.in);
		String ch="";
		int count=0;
		do{
			System.out.println("Enter subString u wanna check..");
			String  sub=sc.next();
			for(int i=0;i<a.length;i++){
				if(a[i].equalsIgnoreCase(sub)){
					count++;
					System.out.println("true");
					break;
				}
			}
			if(count==0){
				System.out.println("False");
			}
			System.out.println("do u want to continue..Y/S");
			ch=sc.next();
		}while(ch.equalsIgnoreCase("y"));
		sc.close();
	}
}
