package com.ashish;

class Table{
	public void printTable(int n){
		for(int i=1;i<=4;i++){
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Thread1 extends Thread{
	Table t;
	Thread1(Table t){
		this.t=t;
	}
	public void run(){
		t.printTable(4);
	}
}

class Thread2 extends Thread{
	Table t;
	Thread2(Table t){
		this.t=t;
	}
	public void run(){
		t.printTable(100);
	}
}

public class Syncrho {
//without synchronization method. here is problem ,there is no consistency.
	public static void main(String[] args) {
	Table t=new Table();
	Thread1 t1=new Thread1(t);
	Thread2 t2=new Thread2(t);
	t1.start();
	t2.start();

	}

}
