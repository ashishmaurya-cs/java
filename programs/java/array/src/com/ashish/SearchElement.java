package com.ashish;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of element:-");
		int n=sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter element of array :-");
		//for store data
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		//display entered data
		System.out.println("Entered element are:-");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Enter element for search:-");
		int search=sc.nextInt();
		//for searching
		int i=0;
		for( i=0;i<n;i++){
			if(a[i]==search){
				System.out.println(search + " is found");
				break;
			}
			
		}
		if(i==n){
			System.out.println(search + " is not found");
	
			
		}
		sc.close();
	}


}
