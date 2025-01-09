package com.ajay.semaphore;

import java.util.concurrent.Semaphore;

public class Worker implements Runnable {
	
	int id = 0;
	Semaphore semaphore;
	
	Worker(int id, Semaphore semaphore){
		this.id = id;
		this.semaphore = semaphore;
	}
	

	@Override
	public void run() {
		try {
			System.out.println("Thread "+id+" is waiting for permit ");
			semaphore.acquire();
			System.out.println("Thread "+id+" has acquired permit ");
			Thread.sleep(1000);
			semaphore.release();
			System.out.println("Thread "+id+" has release permit ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		// limit how many threads can access a resource at the same time.
		Semaphore semaphore = new Semaphore(2);
		
		for(int i=0; i<10; i++) {
			Thread t = new Thread(new Worker(i,semaphore));
			t.start();
		}
		
	}

}
