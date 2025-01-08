package com.ajay.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
	
	private Lock l = new ReentrantLock(true);// fair lock
	// false or no-args constructor that is called unfair lock
	
	public void display(LockExample d) {
		// create lock and unlock across method possible
		//create lock
		l.lock(); //
		display1(d);
		System.out.println("Hi 1");
		System.out.println("Hi 2");
		System.out.println("Hi 3");
		System.out.println("Hi 4");
//		l.unlock();
		
	}
	public void display1(LockExample d) {
		System.out.println("Hi 1");
		System.out.println("Hi 2");
		//release lock
		l.unlock();
		System.out.println("Hi 3");
		System.out.println("Hi 4");	
	}
	public static void main(String[] args) {
		LockExample d = new LockExample();
		Thread t1 = new Thread(()->d.display(d));
		Thread t2 = new Thread(()->d.display1(d));
		Thread t3 = new Thread(()->d.display(d));
		Thread t4 = new Thread(()->d.display1(d));
		t1.start();
		t2.start();	
		t3.start();	
		t4.start();	
	}

}
