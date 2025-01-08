package com.ajay.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class HdfcBank {

	public static void main(String[] args) {
		
		HdfcBank ajayAccount = new HdfcBank();
		
		Thread t1 = new Thread(()->ajayAccount.deposit(10000));
		Thread t2 = new Thread(()->ajayAccount.withdraw(10000));
		Thread t3 = new Thread(()->ajayAccount.balanceEnquiryByPhonePay());
		Thread t4 = new Thread(()->ajayAccount.balanceEnquiryByUPI());
		Thread t5 = new Thread(()->ajayAccount.balanceEnquiryByNetbanking());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
	
	double balance = 0;
	
	ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	void deposit(double amount) {
		
		lock.writeLock().lock();
		balance += amount;
		lock.writeLock().unlock();
		
	}
	
	void withdraw(double amount) {
		
		lock.writeLock().lock();
		balance -= amount;
		lock.writeLock().unlock();
		
	}
	void balanceEnquiryByUPI() {
		
		lock.readLock().lock();
		System.out.println("Balance : "+balance);
		lock.readLock().unlock();
		
	}
	void balanceEnquiryByNetbanking() {
		
		lock.readLock().lock();
		System.out.println("Balance : "+balance);
		lock.readLock().unlock();
		
	}
	void balanceEnquiryByPhonePay() {
		
		lock.readLock().lock();
		System.out.println("Balance : "+balance);
		lock.readLock().unlock();
		
	}
	
}
