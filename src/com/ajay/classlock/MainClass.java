package com.ajay.classlock;

public class MainClass {

	public static void main(String[] args) {
		
		AtmThread t1 = new AtmThread();
		t1.setName("AtmThread");
		GPayThread t2 = new GPayThread();
		t2.setName("GpayThread");
		NetBankingThread t3 = new NetBankingThread();
		t3.setName("NetBankingThread");
		PhonePayThread t4 = new PhonePayThread();
		t4.setName("PhonePayThread");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
