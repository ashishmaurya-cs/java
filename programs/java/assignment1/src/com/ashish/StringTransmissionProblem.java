package com.ashish;
import java.util.Scanner;

public class StringTransmissionProblem {
	public static void main(String[] args) {
		int  count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to sent :-");
		String s=sc.next();
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		for(int i=0;i<s.length();i++){
			
				if(s.charAt(i)==rev.charAt(i)){
					count++;
					
				}
			
		}
		System.out.println(rev);
		System.out.println("Position "+count);
		sc.close();
	}
}
