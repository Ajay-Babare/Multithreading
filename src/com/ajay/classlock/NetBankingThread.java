package com.ajay.classlock;

public class NetBankingThread extends Thread{
	
	@Override
	public void run() {
		HDFCBank.profileUpdate();
	}
}
