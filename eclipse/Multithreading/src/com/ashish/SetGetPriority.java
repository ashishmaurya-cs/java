package com.ashish;

public class SetGetPriority  extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getPriority());
	}
	 public static void main(String[] args){
		 SetGetPriority t1=new SetGetPriority();
		 t1.setPriority(MIN_PRIORITY);
	
		 t1.start();
	 }
}
