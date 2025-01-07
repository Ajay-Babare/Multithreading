package com.ajay.lock;

public class GPayThread extends Thread{
	
	public HDFCBank hdfc;
	
	GPayThread(HDFCBank obj){
		this.hdfc=obj;
	}
	@Override
	public void run() {
		try {
			hdfc.withdraw(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
