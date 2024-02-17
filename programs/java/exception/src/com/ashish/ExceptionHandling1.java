package com.ashish;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		try{
		int i =1;
		int j= 0;
		int k =i/j;
		System.out.println(k);
		}
				catch(ArithmeticException e){
					System.out.println("You can't divide number by zero");
				}

	}

}
