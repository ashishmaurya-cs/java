package com.ashish;


abstract class Person{
	abstract void run();
}
public class AnonymousInner {
	//we can also make a anonymous class using interface.
	public static void main(String[] args) {
		Person p =new Person() {
			
			@Override
			void run() {
				System.out.println("Ajeet  is running very fast...");
				
			}
		};
		p.run();
	}

}
