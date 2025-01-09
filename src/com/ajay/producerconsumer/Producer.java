package com.ajay.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	BlockingQueue<Integer> q = null;
	
	Producer(BlockingQueue<Integer> q){
		this.q = q;
	}

	@Override
	public void run() {
		
		for(int i=1; i<=10; i++) {
			try {
//				Adds an item to the queue. If the queue is full, the producer waits until space is available.
				q.put(i);
				System.out.println("Produce "+i);
				Thread.sleep(900);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
