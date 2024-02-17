package com.ashish;

public class InstanceInitializerBlock {
	 //example of instance inializer block
		{
			int i=100;
			System.out.println("This is An instanceinitializer block : "+i);
		}
	

	public static void main(String[] args) {
		
		new InstanceInitializerBlock();
	}

}
