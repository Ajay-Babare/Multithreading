package com.ajay.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {

	// Java 1.5 -> Executor Framework
	// Single Thread Pool
	// Cached Thread Pool
	// Scheduled Thread Pool 
	// Fixed Thread Pool
	
	public static void main(String[] args) {
		Customer c1 = new Customer("Sachin","PL01",1000.00);
		Customer c2 = new Customer("Virat","PL02",2000.00);
		Customer c3 = new Customer("Dhoni","PL03",3000.00);
		Customer c4 = new Customer("Hardik","PL04",6000.00);
		Customer c5 = new Customer("Shardul","PL05",5000.00);
		Customer c6 = new Customer("Shami","PL06",6000.00);
		Customer c7 = new Customer("Rishabh","PL07",7000.00);
		Customer c8 = new Customer("Rahul","PL08",8000.00);
		
		List<Customer> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		list.add(c6);
		list.add(c7);
		list.add(c8);
		
		
		
//		ExecutorService pool = Executors.newSingleThreadExecutor();
//		ExecutorService pool = Executors.newFixedThreadPool(3);
//		ExecutorService pool = Executors.newCachedThreadPool();
		ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);
		
//		List<Future<Object>> l = new ArrayList<>();
		List<ScheduledFuture<Object>> l = new ArrayList<>();
		
		for(int i=0; i<list.size();i++) {
			TriggerEmail obj = new TriggerEmail(list.get(i));
//			pool.execute(obj); //start()
//			Future<Object> future = pool.submit(obj); //submit(Callable)
//			l.add(future);
			
//			pool.scheduleAtFixedRate(null, i, i, null); // Callable
//			pool.scheduleWithFixedDelay(null, i, i, null); // Callable
			
			ScheduledFuture<Object> scheduledFuture = pool.schedule(obj,2, TimeUnit.SECONDS);
			l.add(scheduledFuture);
//			System.out.println(scheduledFuture);
		}
		
		for(int i=0; i<l.size();i++) {
			ScheduledFuture<Object> ob = l.get(i);
//			ob.get(); // might be blocking so first check isDone()
			if(l.get(i).isDone()) {
				try {
					System.out.println(l.get(i).get());
				} catch (InterruptedException | ExecutionException e) {
					e.printStackTrace();
				}
			}
		}
		
		pool.shutdown();// stop accepting new task
	}

}
