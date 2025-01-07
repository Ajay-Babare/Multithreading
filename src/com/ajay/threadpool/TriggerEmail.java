package com.ajay.threadpool;

public class TriggerEmail implements Runnable{

	private Customer customer;
	
	TriggerEmail(Customer customer){
		this.customer = customer;
	}
	
	@Override
	public void run() {
		TriggerEmail.triggerEmail(customer);
	}
	
	private static void triggerEmail(Customer customer) {
		StringBuffer sb = new StringBuffer();
		sb.append("Hi "+customer.getName()+" Your Policy "+customer.getPolicyNum()+" premium is Due of Rs. "+customer.getPremium());
		System.out.println(sb);
	}

}
