package com.ashish;

import java.util.Arrays;

public class CheckAnagram {
	 public static void main(String[] args) {
		 //anagram means all character should be same in
		 //both word ex "keep" ,"peek"
		String s1="eek";
		String s2="keep";
		if(s1.length()==s2.length()){
			char[] c1=s1.toLowerCase().toCharArray();
			char[] c2=s2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2)){
				System.out.println("It is a Anagram");
			}
			else{
				System.out.println("Not a anagram");
			}
		}
		else{
			System.out.println(" Firstly length should be equals");
		}
	}
}
