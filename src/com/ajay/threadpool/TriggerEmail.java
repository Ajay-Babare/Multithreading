package com.ajay.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

//public class TriggerEmail implements Runnable{
public class TriggerEmail implements Callable<Object>{

	private Customer customer;
	
	TriggerEmail(Customer customer){
		this.customer = customer;
	}
	

//	@Override
//	public void run() {
//			TriggerEmail.triggerEmail(customer);
//	}
	
	@Override
	public Object call() throws Exception {
		Thread.currentThread().getName();
		TriggerEmail.triggerEmail(customer);
		return customer;
	}
	private static void triggerEmail(Customer customer) {
//		List<Object> failure = new ArrayList<>();
//		try {
		StringBuffer sb = new StringBuffer();
		sb.append("Hi "+customer.getName()+" Your Policy "+customer.getPolicyNum()+" premium is Due of Rs. "+customer.getPremium());
		System.out.println(sb);
//		}catch(Exception e) {
//		failure.add(e);
//	}
	}



}
