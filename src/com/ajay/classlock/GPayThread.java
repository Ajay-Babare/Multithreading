package com.ajay.classlock;

public class GPayThread extends Thread{
	
	@Override
	public void run() {
		HDFCBank.withdraw(3000);
	}
}
