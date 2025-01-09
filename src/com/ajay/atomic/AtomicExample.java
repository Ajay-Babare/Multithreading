package com.ajay.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

//	Atomic ensures thread-safe, lock-free operations on shared variables
	static AtomicInteger count = new AtomicInteger(0);
//	static int count = 0;
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(()->{
			for(int i=0;i<1000;i++) {
//				count++;
				count.incrementAndGet();
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=0;i<1000;i++) {
//				count++;
				count.incrementAndGet();
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("Count : "+count);
	}

}
