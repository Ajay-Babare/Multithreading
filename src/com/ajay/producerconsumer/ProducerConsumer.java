package com.ajay.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

	public static void main(String[] args) {
//		thread-safe queue that handles waiting automatically
		BlockingQueue<Integer> q= new ArrayBlockingQueue<>(2);
		
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		
		Thread producer = new Thread(p);
		Thread consumer = new Thread(c);
		
		producer.start();
		consumer.start();
	}

}
