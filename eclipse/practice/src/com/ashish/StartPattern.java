package com.ashish;

import java.util.Scanner;

public class StartPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j<=i){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			for(int j=2;j<=4;j++){
				if(j>=5-i){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
		sc.close();
	}

}
