package com.ajay.thread;

public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Run Method Execute");
			}
		});
		
		t.start();
		t.join();
		System.out.println("Main Method");
	}

}
