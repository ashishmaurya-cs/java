package com.ashish;

public class Concatenation {

	public static void main(String[] args) {
			String s= "Ashish" + " Maurya";//here compiler use stringbuilder and append otstring for concat
			System.out.println(s);
			String s1="Ashish";
			String s2=" Maurya";
			String s3=s1.concat(s2);
			
			System.out.println(s3);
	}

}
