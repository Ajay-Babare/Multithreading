package com.ajay.classlock;

public class PhonePayThread extends Thread{
	
	@Override
	public void run() {
		HDFCBank.balance();
	}
}
