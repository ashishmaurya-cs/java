package com.ashish;

public class DaemonEx extends Thread{
	@Override
		public void run() {
	boolean b =	Thread.currentThread().isDaemon();
	System.out.println(b);
	System.out.println("Welcome in Multithreading");
		}
public static void main(String[] args) {
	DaemonEx d=new DaemonEx();
	
	d.setDaemon(true);
	d.start();
}
}
