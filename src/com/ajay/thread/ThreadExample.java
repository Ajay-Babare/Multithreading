package com.ajay.thread;
// 3 ways to create the Thread
// 1. extending Thread class
// 2. implementing the Runnable interface
// 3. Implementing the Callable interface


// Thread State -> new, runnable, running, sleep, wait, dead
public class ThreadExample extends Thread{
	ThreadExample(){
		super();
	}
	ThreadExample(String str){
		super(str);
	}
	public static void main(String[] args) {
		ThreadExample t1 = new ThreadExample();//new
		t1.setName("abc");
		ThreadExample t2 = new ThreadExample("ThreadName");
		t1.start(); // It create independent path of execution
		t2.start(); // runnable
	}
	
	@Override
	public void run() {//running
		System.out.println("Hi");
		System.out.println(Thread.currentThread().getName());
	}
}
