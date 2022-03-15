package com.bank.accounts;

public class Account {
	long userId;
	String userName;
	float balance;
	static float inRate=0.005f;
	int transCount=0; 
	String accType;
	
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(long id,String name,float bal,String at) {
		userId=id;
		userName=name;
		balance=bal;
		accType=at;
	}
	
	public void withdraw(float amount)
	{
		balance=balance-amount;
		transCount++;
	}
	public void deposit(float amount)
	{
		balance=balance+amount;
		transCount++;
	}
	
	public float calculateInterest() {
		return (balance*inRate)*25;
	}

}
	

