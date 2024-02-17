package com.ashish;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		/*String name="Ashish";
		int length=name.length();
		String a="";
		for(int i=length-1;i>=0;i--){
		 a= a+name.charAt(i);
		}
		System.out.println("Welcome to String reverse");
		System.out.println(a); */
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  a String ");
		String str=sc.nextLine();
		String s="";
		for(int i=str.length()-1;i>=0;i--){
			s=s+str.charAt(i);
		}
		System.out.println(s);
		sc.close();
	}

}
