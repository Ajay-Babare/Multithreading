package com.ajay.classlock;

public class HDFCBank {

	static Integer balance=7000;
	
	synchronized public static void withdraw(Integer amount) {
		balance=balance-amount;
	}
	
	synchronized public static void deposit(Integer amount) {
		balance=balance+amount;
	}
	
	synchronized public static void  balance() {
		System.out.println("Balance : "+balance);
	}
	public static void profileUpdate() {
		System.out.println("Profile Updated");
	}
	
}
