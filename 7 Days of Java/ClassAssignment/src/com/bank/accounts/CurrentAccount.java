package com.bank.accounts;

public class CurrentAccount extends Account {
	static float overDraft=100000;
	public CurrentAccount(long id,String name, float bal,String tp) {
		super(id,name,bal,tp);
	}
}
