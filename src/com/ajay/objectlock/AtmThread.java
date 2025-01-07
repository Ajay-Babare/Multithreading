package com.ajay.objectlock;

public class AtmThread extends Thread{
	
	public HDFCBank hdfc;
	
	AtmThread(HDFCBank obj){
		this.hdfc=obj;
	}
	
	@Override
	public void run() {
		hdfc.withdraw(2000);
	}
}
