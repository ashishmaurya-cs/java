package com.ashish;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elment of array");
		int n=sc.nextInt();
		int[] a =new int[n];
		System.out.println("Enter element of array:-");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Entered element are");
		for(int i=0;i<n;i++){
			System.out.print(a[i]);
		}
		int temp;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(a[j]>a[j+1]){
				 temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted element are:-");
		for(int i=0;i<n;i++){
			System.out.print(" "+a[i]);
		}
		sc.close();
	}

}
