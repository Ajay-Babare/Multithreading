package com.ajay.threadlocal;

public class ThreadLocalExample extends Thread{

	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadLocalExample());
		t1.start();
	}

	// Local variable for single particular thread
	ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

	@Override
	public void run() {
		threadLocal.set(10);
		System.out.println("Inside run() Before display(): "+threadLocal.get());
		display();
		System.out.println("Inside run() After display() Modified : "+threadLocal.get());
	}

	private void display() {
		System.out.println("Inside display() before Modify: "+threadLocal.get());
		threadLocal.set(20);
		System.out.println("Inside display() after Modify: "+threadLocal.get());
	}
}
