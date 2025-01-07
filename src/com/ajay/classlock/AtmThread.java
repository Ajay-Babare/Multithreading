package com.ajay.classlock;

public class AtmThread extends Thread{
	
	@Override
	public void run() {
		HDFCBank.withdraw(2000);
	}
}
