package com.ashish;

import java.util.Scanner;

public class BuubleSort {
	


	
		public static void main(String[] args) {
		
			int temp;
			System.out.println("This is the Bubble sort");
				Scanner sc = new  Scanner(System.in);
				String text;
				do{
					System.out.println("Enter number of element");
					int n =sc.nextInt();
					int[] a = new int[n];
					System.out.println("Enter element for  sorting");
					for(int i=0;i<n;i++){
						a[i] = sc.nextInt();
					}		
					
							System.out.println("Entered element are");
							for(int i=0;i<n;i++){
								System.out.print(a[i] +" ");
							}
							System.out.println();
							//for sorting
								for(int i=0;i<n-1;i++){
										for(int j=0;j<n-1-i;j++){
											if(a[j]>a[j+1]){
												temp = a[j];
												a[j] = a[j+1];
												a[j+1] = temp;
											}
										}
								}   
									System.out.println("Press any number to get sorted array");
								   // int c = sc.nextInt();
									//for print sorted array
									System.out.println("Sorted array are:-");
									for(int j =0;j<n;j++){
										System.out.print(a[j]+" ");
									}
									System.out.println();
									System.out.println("do you want to continue...Y/N");
									text= sc.next();
									
				}while(text.equalsIgnoreCase("y"));					
				sc.close();
				System.out.println("Thanks for visit :)");
					}

}

