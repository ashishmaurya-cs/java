package com.ashish;


class table{
	void printTable(int n){
		
		synchronized (this) {
			for(int i=1;i<=3;i++){
				System.out.print(n*i+",");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		}
	}

class TThread1 extends Thread{
	table t;
	TThread1 (table t){
		this.t=t;
	}
	public void run(){
		t.printTable(2);
	}
}

class TThread2 extends Thread{
	table t;
	TThread2 (table t){
		this.t=t;
	}
	public void run(){
		t.printTable(5);
	}
}


public class SynchronizedBlock {

	public static void main(String[] args) {
		System.out.println("Example of synchronized block..");
		table obj=new table() ;
		TThread1 t1=new TThread1(obj);
		TThread2 t2=new TThread2(obj);
		t1.start();
		t2.start();
		
	}
}
