package com.ashish;

public class StaticMethod {
 static int cube(int n){
	 return n*n*n;
 }
 
 public static void main(String[] args) {
int cube=StaticMethod.cube(5);
System.out.println(cube);
}
}
