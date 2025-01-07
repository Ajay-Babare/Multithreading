package com.ajay.threadpool;

public class Customer {

	private String name;
	private String policyNum;
	private Double premium;
	private String message;
	
	public Customer(String name, String policyNum, Double premium) {
		this.name = name;
		this.policyNum = policyNum;
		this.premium = premium;
		
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPolicyNum() {
		return policyNum;
	}

	public void setPolicyNum(String policyNum) {
		this.policyNum = policyNum;
	}

	public Double getPremium() {
		return premium;
	}

	public void setPremium(Double premium) {
		this.premium = premium;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
		
}
