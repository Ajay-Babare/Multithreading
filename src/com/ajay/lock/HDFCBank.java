package com.ajay.lock;

public class HDFCBank {

	Integer balance;
	
	HDFCBank(Integer amount){
		this.balance=amount;
	}
	
	synchronized public void withdraw(Integer amount) {
		this.balance=this.balance-amount;
	}
	
	synchronized public void deposit(Integer amount) {
		this.balance=this.balance+amount;
	}
	
	synchronized public void  balance() {
		System.out.println("Balance : "+this.balance);
	}
	public void profileUpdate() {
		System.out.println("Profile Updated");
	}
	
}
