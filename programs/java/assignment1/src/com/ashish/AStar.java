package com.ashish;

import java.util.Scanner;

public class AStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of row and column");
		int m=sc.nextInt();
		int n=sc.nextInt();
		double f;
		double ff;
		if(m%2==0||n%2==0){
			 f=Math.ceil((double)(m+1)/2);
			ff=Math.ceil((double)(n+1)/2);
		}
		else{
			 f=Math.ceil((double)m/2);
			 ff=Math.ceil((double)n/2);
		}
		System.out.println(f);
		System.out.println(ff);
		for(int i =1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(m+1-i==j||(i==f&&j>=ff)){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			
			for(int j=2;j<=n;j++){
				if(i==j||(i==f&&j<=ff)){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
