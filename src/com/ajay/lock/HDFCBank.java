package com.ajay.lock;

public class HDFCBank {

	Integer balance;
	
	HDFCBank(Integer amount){
		this.balance=amount;
	}
	
	synchronized public void withdraw(Integer amount) throws InterruptedException {
		if(amount<balance) {
			wait();// wait method release the lock	
		}
//		Thread.sleep(100000);// runnable pool - sleep(milisec) does not release the lock
		this.balance=this.balance-amount;
	}
	
	synchronized public void deposit(Integer amount) {
		this.balance=this.balance+amount;
		notifyAll();
	}
	
	synchronized public void  balance() {
		System.out.println("Balance : "+this.balance);
	}
	public void profileUpdate() {
		System.out.println("Profile Updated");
	}
	
}
