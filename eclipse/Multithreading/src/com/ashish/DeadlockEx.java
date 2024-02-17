package com.ashish;

public class DeadlockEx {
	public static void main(String[] args) {
		String resource1="Ashish Maurya";
		String resource2 ="Ajeet";
		
		Thread t1=new Thread(){
			public void run(){
				synchronized (resource1) {
					System.out.println("Thread 1 : locked resource 1");;
				
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				synchronized (resource2) {
					System.out.println("Thread 1 :locked resource 2");
				}
				}
			}
		};
		
		Thread t2= new Thread(){
			public void run(){
				synchronized (resource2) {
				System.out.println("Thread 2: locked resource 2");	
				
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				synchronized (resource1) {
					 System.out.println("thread 2 : locked resource 1");
				}
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
