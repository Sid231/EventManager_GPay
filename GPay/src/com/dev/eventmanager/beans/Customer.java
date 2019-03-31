package com.dev.eventmanager.beans;

public class Customer {

	private String customerName;
	private String emailAddress;
	private String phoneNumber;
	private int customerID;
	private int amount;
	
	public Customer(String customerName, String emailAddress, String phoneNumber, int amount) {
		super();
		this.customerName = customerName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.amount = amount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
