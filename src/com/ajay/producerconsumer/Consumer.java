package com.ajay.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<Integer> q = null;
	
	Consumer(BlockingQueue<Integer> q){
		this.q = q;
	}

	@Override
	public void run() {	
		for(int i=1; i<=10;i++) {
			try {
				// Removes an item from the queue. If the queue is empty, the consumer waits until an item is available.
				Integer take = q.take();
				System.out.println("Consume : "+take);
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
