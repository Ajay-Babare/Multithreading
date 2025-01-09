package com.ajay.deadlock;

public class Thread2WithProperSynchronizedOrder extends Thread {

	
	Object obj1 = null;
	Object obj2 = null;
	
	Thread2WithProperSynchronizedOrder(Object obj1, Object obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	@Override
	public void run() {
		
		System.out.println("Thread2 about to lock on obj1");
		
		synchronized(obj1){
			System.out.println("Thread2 acquired lock on obj1");
			try {
				Thread.sleep(100000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Thread2 trying to acquire the lock obj2");
		
		synchronized(obj2) {
			System.out.println("Thread2 acquired lock on obj2");
		}
	
		System.out.println("Thread2 realease the lock");
		
	}

}
