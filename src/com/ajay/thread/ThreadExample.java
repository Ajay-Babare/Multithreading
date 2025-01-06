package com.ajay.thread;

public class ThreadExample extends Thread{
	
	public static void main(String[] args) {
		ThreadExample t1 = new ThreadExample();
		ThreadExample t2 = new ThreadExample();
		t1.start();
		t2.start();
	}
	
	@Override
	public void run() {
		System.out.println("Hi");
	}
}
