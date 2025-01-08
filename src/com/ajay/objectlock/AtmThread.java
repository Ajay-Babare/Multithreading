package com.ajay.objectlock;

public class AtmThread extends Thread{
	
	public HDFCBank hdfc;
	
	AtmThread(HDFCBank obj){
		this.hdfc=obj;
	}
	
	@Override
	public void run() {
		try {
			hdfc.withdraw(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
