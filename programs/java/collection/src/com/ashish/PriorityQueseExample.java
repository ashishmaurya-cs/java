package com.ashish;

import java.util.PriorityQueue;

public class PriorityQueseExample {
	public static void main(String[] args) {
		PriorityQueue<String> p=new PriorityQueue<>();
		p.add("Ashish");
		p.add("Ajeet");
		p.add("Prabhat");
		p.add("Anoop");
		System.out.println(p.element());
		//it deos not maintain FIFO manner
		System.out.println(p.peek());
		System.out.println(p.remove());
		System.out.println(p.poll());
		System.out.println(p);
	}
}
