package com.ashish;


class Animals{
	String color ="White";
}

class Dogs extends Animals{
	String color ="Black";
	
	void printColor(){
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperVariable {
public static void main(String[] args) {
	new Dogs().printColor();
}
}
