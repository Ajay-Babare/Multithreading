package com.ajay.thread;

public class RunnableExample implements Runnable{

	public static void main(String[] args) {
		RunnableExample obj = new RunnableExample();
				Thread t = new Thread(obj);
				t.start();
	}

	@Override
	public void run() {
		System.out.println("hello");
	}

}
