package com.ashish;

import java.util.StringTokenizer;

public class StringTokenDelimeter {
	  public static void main(String[] args) {  
	       StringTokenizer st = new StringTokenizer("my,name,is,khan");  
	        
	      // printing next token 
	       while(st.hasMoreTokens()){
	      System.out.println("Next token is : " + st.nextToken(","));  
	       }
	   }  

}
