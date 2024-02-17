package com.ashish;

public class Overloading1 {
  void add(int a,int b){
	  System.out.println(a+b);
  }
  
  void add(int a,int b ,int c){
	  System.out.println(a+b+c);
  }
  
  public static void main(String[] args) {
	Overloading1 o =new Overloading1();
	o.add(2, 6);
	o.add(1, 2, 4);
}
}
