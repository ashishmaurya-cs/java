package com.ashish;

import java.util.Scanner;

public class Pattern11 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of row");
		int m =  sc.nextInt();
		System.out.print("Enter the number of column");
		int n =  sc.nextInt();
		sc.close();
		for(int i=1; i<=m;i++){
		
		     for(int j=1;j<=n;j++){
		    	 if(j==m+1-i){
		    		System.out.println("*  "); 
		    		 
		    	 }
		    	 else{
		    		 
		    		 System.out.print("  ");
		    	 }
		     }
		     System.out.println();
		     
		}
	    
		}
}
