package com.ashish;

import java.util.Scanner;

public class Pattern15 {
public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of row");
		int m =  sc.nextInt();
		System.out.print("Enter the number of column");
		int n =  sc.nextInt();
		sc.close();
		for(int i=1; i<=m;i++){
			    for(int j=1;j<=n;j++){
			    	if((i>1&&i<m)&&(j>1&&j<n)){
			    		System.out.print("  ");
			    	}
			    	else{ 
			    		System.out.print("* ");
			    	}
			    }
			    System.out.println();
		}
	}

}
