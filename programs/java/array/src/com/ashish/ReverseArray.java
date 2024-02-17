package com.ashish;
import java.util.Scanner;
public class ReverseArray {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a=new int[4];
		System.out.println("Enter element of array:-");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		//display entered element
		System.out.println("Entered element are:-");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		
		//for reverse element
		
		System.out.println("Reverse element of array:-");
		for(int i=a.length-1;i>=0;i--){
			System.out.print(a[i]+"\t");
		}
		sc.close();
	}

}
