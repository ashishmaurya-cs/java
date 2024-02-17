package com.ashish;

import java.util.Scanner;

public class FindAnyHighestNumber {
	
	int AnyHighestNumber(int[] a,int n,int t){
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
		return a[n-t];
	}
	 public static void main(String[] args) {
		System.out.println("Enter number of element of array :-");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter element of array :-");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter term which highest number you want ...?");
		int t=sc.nextInt();
		FindAnyHighestNumber f= new FindAnyHighestNumber();
		int result=f.AnyHighestNumber(a,n,t);
		System.out.println(t+"Highest is :- "+result);
		sc.close();
	}
}
