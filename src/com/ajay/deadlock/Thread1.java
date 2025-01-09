package com.ajay.deadlock;

public class Thread1 extends Thread{

	Object obj1 = null;
	Object obj2 = null;
	
	Thread1(Object obj1, Object obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	@Override
	public void run() {
		
		System.out.println("Thread1 about to lock");
		
		synchronized(obj1){
			System.out.println("Thread1 acquired lock on obj1");
			try {
				Thread.sleep(100000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Thread1 about to lock obj2");
		
		synchronized(obj2) {
			System.out.println("Thread1 acquired lock on obj2");
		}
		
		System.out.println("Thread1 realease the lock");
	}
}
