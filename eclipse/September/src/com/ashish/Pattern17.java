package com.ashish;

import java.util.Scanner;

public class Pattern17 {
	 public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("ENter number of row and column");
		 int m= sc.nextInt();
		 int n=sc.nextInt();
		 for(int i=1;i<=m;i++){
			 for(int j=1;j<=n;j++){
				 if(j==m+1-i){//i==j
					 System.out.print("* ");
				 }
				 else{
					 System.out.print("  ");
				 }
			 }
			 System.out.println();
			 sc.close();
		 }
	}
}
