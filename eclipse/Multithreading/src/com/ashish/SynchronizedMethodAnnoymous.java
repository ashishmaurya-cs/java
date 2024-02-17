package com.ashish;

class TTable{
	synchronized void printTable(int n){
		for(int i=1;i<4;i++){
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class SynchronizedMethodAnnoymous {
	public static void main(String[] arg){
		TTable t=new TTable();
		Thread t1=new Thread(){
			public void run(){
				t.printTable(4);
			}
		};//anonymous class
		
		Thread t2=new Thread(){
			public void run(){
				t.printTable(10);
			}
		};
		
		t1.start();
		t2.start();
	}

}
