package com.ajay.lock;

public class SynchronizedExample {

	synchronized public void display(SynchronizedExample d) {
		//create lock
		display1(d);
		System.out.println("Hi 1");
		System.out.println("Hi 2");
		System.out.println("Hi 3");
		System.out.println("Hi 4");
		
	}
	public void display1(SynchronizedExample d) {
		System.out.println("Hi 1");
		System.out.println("Hi 2");
		//release lock
		synchronized(d){
			System.out.println("Hi 3");
			System.out.println("Hi 4");	
		}
	}
	
	public static void main(String[] args) {
		SynchronizedExample s = new SynchronizedExample();
		Thread t1 = new Thread(()->s.display(s));
		t1.start();
		Thread t2 = new Thread(()->s.display1(s));
		t2.start();	
	}

}
