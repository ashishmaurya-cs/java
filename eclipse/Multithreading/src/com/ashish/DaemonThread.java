package com.ashish;
public class DaemonThread  extends Thread{
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println("Daemon is working..");
		}
		else{
			System.out.println("Normal Thread is working..");
		}
	}



	public static void main(String[] args){
		DaemonThread t1=new DaemonThread();
		DaemonThread t2=new DaemonThread();
		t1.setDaemon(true);
		t1.start();
		t2.start();
		
	}
}


