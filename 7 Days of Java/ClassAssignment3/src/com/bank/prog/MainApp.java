package com.bank.prog;

public class MainApp {
public static void main(String[] args) {
	Account user1=new Account();
	user1.setName("Abhij2i");
	user1.setBalance(300);
	user1.withdraw(-500);
	try {
		user1.deposit(-500);
	} catch (NegativeAmount e) {
		// TODO Auto-generated catch block
		System.out.println("hello bro");
	}
	
}
}
