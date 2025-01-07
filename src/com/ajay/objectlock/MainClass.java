package com.ajay.objectlock;

public class MainClass {

	public static void main(String[] args) {
		
		HDFCBank ajayAccount = new HDFCBank(7000);
		HDFCBank akshayAccount = new HDFCBank(10000);
		AtmThread t1 = new AtmThread(ajayAccount);
		t1.setName("AtmThread");
		GPayThread t2 = new GPayThread(ajayAccount);
		t2.setName("GpayThread");
		NetBankingThread t3 = new NetBankingThread(akshayAccount);
		t3.setName("NetBankingThread");
		PhonePayThread t4 = new PhonePayThread(akshayAccount);
		t4.setName("PhonePayThread");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
