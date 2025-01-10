package com.ajay.thread;

public class InterruptExample implements Runnable {

	public static void main(String[] args) {
		Thread t = new Thread(new InterruptExample());
		t.start();
		// interrupt() doesn’t stop a thread, it just signals it to handle interruption.
		t.interrupt();
		System.out.println("Main is trying to interuppt");
	}

	@Override
	public void run() {
		if(Thread.currentThread().isInterrupted()) {
			System.out.println("Interrupted");
		}
		System.out.println("Inside run()");
	}

}
