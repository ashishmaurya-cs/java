package com.ashish;

public class StringExample {

	public static void main(String[] args) {
		char[] ch={'m','a','u','r','y','a'};
		String s= new String(ch);//String is a basically object ,which array of characters. array to ctring
		System.out.println("sequence of char  "+s); 
		
		String sc="maurya";//same as above characters array//string literal
		System.out.println("String "+sc);
		
		String s2=new String("Ashish");//creating string by new keyword
		System.out.println(s2);
	}

}
