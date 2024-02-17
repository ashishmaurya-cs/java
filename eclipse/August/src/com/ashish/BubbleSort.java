package com.ashish;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		System.out.println("Enter number of element :-");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter element of array :-");
		int[] a= new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.println("Entered element are :-");
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
		
		int temp;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("Sorted element are:-");
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
		
		sc.close();
	}

}
