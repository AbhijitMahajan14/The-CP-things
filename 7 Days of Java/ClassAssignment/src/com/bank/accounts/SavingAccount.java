package com.bank.accounts;

public class SavingAccount extends Account {
	static float minBal=10000;
	public SavingAccount(long id,String name, float bal,String tp) {
		super(id,name,bal,tp);
		if(this.balance<10000)
		{
			System.out.println("Your account cross the minimum balance limit !!");
			this.balance-=500;
		}
	}	
	}
