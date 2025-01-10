package com.ajay.daemon;

public class DaemonExample extends Thread {

	public static void main(String[] args) {
		DaemonExample t = new DaemonExample();
		t.setDaemon(true);
//		t = null;
		
		System.gc();
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Daemon executed");
	}

}
