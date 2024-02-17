package com.ashish;



class Animal{
	void eat(){
		System.out.println("Animal is eating..");
	}
}

class Dog extends Animal{
	void bark(){
		System.out.println("Barking...");
	}
}

class Cat extends Animal{
	void meow(){
		System.out.println("Meow....");
	}
}

public class Hierarchical {
	public static void main(String[] args) {
		 Cat s=new Cat();
		 s.eat();
		 s.meow();
		 
	}
	 
}
