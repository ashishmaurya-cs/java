package com.ashish;

import java.util.Scanner;

public class HighestElement {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter numbe rof element of array");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter element of array :-");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
		
		int highest=a[0];
		for(int i=1;i<n;i++){
			if(highest<a[i]){
				highest=a[i];
			}
		}
		
		System.out.println("Highest element is :-"+highest);
		sc.close();
		
	}
}
