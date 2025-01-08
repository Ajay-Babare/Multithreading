package com.ajay.lock;

public class GPayThread extends Thread{
	
	public HDFCBank hdfc;
	
	GPayThread(HDFCBank obj){
		this.hdfc=obj;
	}
	@Override
	public void run() {
		hdfc.deposit(5000);
	}
}
