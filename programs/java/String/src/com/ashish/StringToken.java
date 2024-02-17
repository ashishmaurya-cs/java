package com.ashish;

import java.util.StringTokenizer;

public class StringToken {
	 
		 public static void main(String args[]){  
			   StringTokenizer st = new StringTokenizer("my name is khan ");  
		     while (st.hasMoreElements()) {  
		         System.out.println(st.nextElement());  
		     }  
		   }  
		
}
