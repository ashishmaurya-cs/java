package com.ashish;

public class SetNameGetname  extends Thread{
	
	public void run(){
		System.out.println("Threda is running..");
		System.out.println(Thread.currentThread().getName());
	}

	
	public static void main(String[] args){
		SetNameGetname t1=new SetNameGetname();
		t1.start();
		t1.setName("Ashish");
	}
}
