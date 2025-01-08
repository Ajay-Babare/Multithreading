package com.ajay.objectlock;

public class PhonePayThread extends Thread{
	
	public HDFCBank hdfc;
	
	PhonePayThread(HDFCBank obj){
		this.hdfc=obj;
	}
	@Override
	public void run() {
		hdfc.balance();
	}
}
