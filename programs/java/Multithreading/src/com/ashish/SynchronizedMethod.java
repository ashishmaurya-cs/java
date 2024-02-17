package com.ashish;
//example of synchronization method
class TTTTable{
	synchronized void printTable(int n){
		for(int i=1;i<4;i++){
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread1 extends Thread{
	TTTTable t;
	Thread1(TTTTable t){
		this.t=t;
		}
	public void run(){
		t.printTable(4);
	}
}

class Thread2 extends Thread{
	TTTTable t;
	Thread2(TTTTable t){
		this.t=t;
		}
	public void run(){
		t.printTable(10);
	}
}

public class SynchronizedMethod {
	public static void main(String[] arg){
		TTTTable t=new TTTTable(); //shared resource
		Thread1 t1=new Thread1(t);
		Thread2 t2=new Thread2(t);
		t1.start();
		t2.start();
	}

}
