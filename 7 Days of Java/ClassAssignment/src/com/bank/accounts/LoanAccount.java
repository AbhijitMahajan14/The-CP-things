package com.bank.accounts;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;  
import java.util.Calendar; 

public class LoanAccount extends Account {
	float initialLoan;
	static int cnt;
	static String[] loanHistory=new String[100];
	public LoanAccount(long id, String name, float bal,String tp,float loan) {
		super(id,name,bal,tp);
		initialLoan=loan;
		loanHistory[0]=Float.toString(initialLoan);
		Date date = new Date();
		Date date1 = Calendar.getInstance().getTime();  
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
		String strDate = dateFormat.format(date1);
		loanHistory[1]=strDate;
		System.out.println(loanHistory[0]);
		System.out.println(loanHistory[1]);
	}
	
	
	public static void maintainHistory(float amount,String d) {
		for(cnt=2;cnt<loanHistory.length;cnt=cnt+2)
		{
			loanHistory[cnt]=Float.toString(amount);
			int d1=cnt+1;
			//DateFormat dateFormat1 = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss"); 
			loanHistory[d1]=d;
		}
	}
}
 