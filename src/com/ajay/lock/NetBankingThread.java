package com.ajay.lock;

public class NetBankingThread extends Thread{
	
	public HDFCBank hdfc;
	
	NetBankingThread(HDFCBank obj){
		this.hdfc=obj;
	}
	@Override
	public void run() {
		hdfc.profileUpdate();
	}
}
