package com.ajay.lock;

public class MainClass {

	public static void main(String[] args) {
		
		HDFCBank ajayAccount = new HDFCBank(5000);
		
		AtmThread t1 = new AtmThread(ajayAccount);
		t1.setName("AtmThread");
		GPayThread t2 = new GPayThread(ajayAccount);
		t2.setName("GpayThread");
		
		t1.start();
		t2.start();
			
		HDFCBank akshayAccount = new HDFCBank(10000);
		
		NetBankingThread t3 = new NetBankingThread(akshayAccount);
		t3.setName("NetBankingThread");
		PhonePayThread t4 = new PhonePayThread(akshayAccount);
		t4.setName("PhonePayThread");
				
		t3.start();
		t4.start();
	}

}
