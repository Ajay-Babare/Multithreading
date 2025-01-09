package com.ajay.deadlock;

public class MainClass {
	
	public static void main(String[] args) {
	
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		Thread1 t1 = new Thread1(obj1,obj2);
//		Thread2 t2 = new Thread2(obj1,obj2);
		Thread2WithProperSynchronizedOrder t2 = new Thread2WithProperSynchronizedOrder(obj1,obj2);
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		
		t1.start();
		t2.start();
		
	}
}
