package com.ashish;

public class StatiNested {
	  static int data=30;  
	  static class Inner{  
	   void msg(){System.out.println("data is "+data);}  
	  }  
	  public static void main(String args[]){  
	  StatiNested.Inner obj=new StatiNested.Inner();  
	  obj.msg();  
	  } 
}
