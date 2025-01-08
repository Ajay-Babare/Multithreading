package com.ajay.lock;

public class HDFCBank {

	Integer balance;
	
	HDFCBank(Integer amount){
		this.balance=amount;
	}
	
	synchronized public void withdraw(Integer amount) throws InterruptedException {
		if(balance<amount) {
			wait();// wait:Object method release the lock	
			// wait method can not be call without synchronized keyword
		}
//		Thread.sleep(100000);// runnable pool - sleep(milisec):Thread does not release the lock
		// sleep method can call with or without synchronized keyword
		balance=this.balance-amount;
	}
	
	synchronized public void deposit(Integer amount) {
		balance=this.balance+amount;
//		notify();// allow only one thread to execute which are in waiting state of particular object
		notifyAll();// allow all thread to execute which are in waiting state of particular object
	}
	
	synchronized public void  balance() {
		System.out.println("Balance : "+this.balance);
	}
	public void profileUpdate() {
		System.out.println("Profile Updated");
	}
	
}
