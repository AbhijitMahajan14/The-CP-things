package com.bank.accounts;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class SalaryAccount extends SavingAccount{
	static Long timeLimit=5000l;
	static int min=10000;
	
	String accountStart;
	public SalaryAccount(long id, String name, float bal,String tp) {
		super(id,name,bal,tp);

		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
		 LocalDateTime now = LocalDateTime.now(); 
		 accountStart=dtf.format(now);
		 System.out.println("Account start date "+dtf.format(now));
	}
	
	
}
