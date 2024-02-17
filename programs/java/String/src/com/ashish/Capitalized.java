package com.ashish;

import java.util.Scanner;

public class Capitalized {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string to Capitalized :-");
		String s=sc.nextLine();
		String[] words=s.split("\\s");
		String capitalizedWord=" ";
		for(String ss:words){
			String firstChar=ss.substring(0, 1);
			String afetrFistChar=ss.substring(1);
			capitalizedWord=firstChar.toUpperCase()+afetrFistChar.toLowerCase();
		
			System.out.println(capitalizedWord);
			sc.close();
		}

	}

}
