package com.ashish;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  String to find out duplicate.");
		String s=sc.nextLine();
		
		String[] ar=s.split("\\s");

		for(int i=0;i<ar.length;i++){
			 int count = 1;
			for(int j=i+1;j<ar.length;j++){
				if(ar[i].equals(ar[j])){
					count++;
					ar[j]="0";
				}
			}
			if(count>1&&ar[i]!="0"){
				System.out.println(ar[i]+" "+count);
			}
		}
		sc.close();
	}
}
