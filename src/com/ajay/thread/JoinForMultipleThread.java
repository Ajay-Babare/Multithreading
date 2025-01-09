package com.ajay.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JoinForMultipleThread {

	public static void main(String[] args) throws InterruptedException {
		
		// It creates a counter that waits for 10 actions
		CountDownLatch c = new CountDownLatch(10);
		
		// It creates a thread pool with <2> threads to execute tasks concurrently
		ExecutorService ex = Executors.newFixedThreadPool(2);
		
		for(int i=0; i<10; i++) {
			ex.execute(new Runnable() {

				@Override
				public void run() {
					System.out.println("Salary Calculation");
					
					// It decreases the counter by 1
					c.countDown();
				}
				
			});
		}
		
		// It makes the thread wait until the counter hits zero
		c.await();
		System.out.println("Generate salary Report");
	}

}
