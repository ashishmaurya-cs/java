package com.ashish;

public class FinalizeExample {
	public void finalize(){
		System.out.println("finalize called");
		}  
	
	public static void main(String[] args){  
	new FinalizeExample();  
	//f=null; 
	System.gc();  
	} 
}


