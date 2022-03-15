package com.bank.accounts;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class MainApp {
	
//	public static void createMyAccount(Account[] acc)
//	{
//		Scanner sc=new Scanner(System.in);
//		}
	
//	public static void withdrawMoney(Account[]acc)
//	{
//		Scanner sc=new Scanner(System.in);
//		
//	}
	static long findDifference(String start_date,
			String end_date)
{
	SimpleDateFormat sdf
		= new SimpleDateFormat(
			"dd-MM-yyyy HH:mm:ss");
	try {
		Date d1 = sdf.parse(start_date);
		Date d2 = sdf.parse(end_date);
        long difference_In_Time
            = d2.getTime() - d1.getTime();
		System.out.print(
			"Difference "
			+ "between two dates is: ");

		return difference_In_Time/60;
	}

	catch (ParseException e) {
		e.printStackTrace();
	}
	return 0;
}

		public static void creatMyAccount(Account[]acc)
		{
			Scanner sc=new Scanner(System.in);
			int x;
			System.out.println("How many account you want to create :");
			int accCount=sc.nextInt();
			Long id;
			for(x=0;x<accCount;x++)
			{
				id=20003344L+x*2;
				System.out.println("Enter Your Name :");	
				String name=sc.next();
				System.out.println("Enter Initial Balance :");
				float bal=sc.nextFloat();
				System.out.println("Enter Account type :");
				String type=sc.next();	
				
				if(type.equals("saving")) {
					acc[x]=new SavingAccount(id,name,bal,type);
					System.out.println("Account Number :"+acc[x].userId);
					System.out.println("Account Name :"+acc[x].userName);
					System.out.println("Account Balance :"+acc[x].balance);
					System.out.println("Account Type :"+acc[x].accType);
				}
				else if(type.equals("current"))
				{
					acc[x]=new CurrentAccount(id,name,bal,type);
					System.out.println("Account Number :"+acc[x].userId);
					System.out.println("Account Name :"+acc[x].userName);
					System.out.println("Account Balance :"+acc[x].balance);
					System.out.println("Account Type :"+acc[x].accType);
				}
				else if(type.equals("salary"))
				{
					acc[x]=new SalaryAccount(id,name,bal,type);
					System.out.println("Account Number :"+acc[x].userId);
					System.out.println("Account Name :"+acc[x].userName);
					System.out.println("Account Balance :"+acc[x].balance);
					System.out.println("Account Type :"+acc[x].accType);
				}
				else if(type.equals("loan"))
				{
					System.out.println("How much loan you want :");	
					float loan=sc.nextFloat();		
					acc[x]=new LoanAccount(id,name,bal,type,loan);
					System.out.println("Account Number :"+acc[x].userId);
					System.out.println("Account Name :"+acc[x].userName);
					System.out.println("Account Balance :"+(acc[x].balance-loan));
					System.out.println("Account Type :"+acc[x].accType);
				}

				
			}	
		}
		
		
		public static void withdrawMyMoney(Account[]acc)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Account number :");
			long ac;
			ac=sc.nextLong();
			int idx=(int)(ac-20003344)/2;
			System.out.println("Enter amount you want to withdraw :");
			float withdrawAmount;
			withdrawAmount=sc.nextFloat();
			acc[idx].balance=acc[idx].balance-withdrawAmount;
			if(acc[idx].accType.equals("saving"))
			{
				if(acc[idx].balance<SavingAccount.minBal)
				{
					System.out.println("Your account cross the minimum balance limit !!");
					acc[idx].balance-=500;
				}
			}
			if(acc[idx].accType.equals("current"))
			{
				if(acc[idx].balance<0)
				{
					acc[idx].balance=acc[idx].balance+CurrentAccount.overDraft;	
				}
			}
			if(acc[idx].accType.equals("loan"))
			{
				Date date = new Date();
				Date date1 = Calendar.getInstance().getTime();  
			    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
				String strDate = dateFormat.format(date1);
				LoanAccount.maintainHistory(withdrawAmount,strDate);
				System.out.println(LoanAccount.loanHistory[3]);
			}
			if(acc[idx].accType.equals("salary"))
			{
				SalaryAccount.transCount();
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
				LocalDateTime now = LocalDateTime.now();
				//findDifference(acc[idx].accountStart,now);
				
			}
			
//			if(acc[idx].accType.equals("loan"))
//			{
//				System.out.println(acc[idx].loanHistory[1]);
//			}
//			
			System.out.println("Current Balance :"+acc[idx].balance);
		}
		
	


		public static void depositMyMoney(Account[]acc)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Account number :");
			long ac;
			ac=sc.nextLong();
			int idx=(int)(ac-20003344)/2;
			System.out.println("Enter amount you want to deposit :");
			float depoAmount;
			depoAmount=sc.nextFloat();
			acc[idx].balance=acc[idx].balance+depoAmount;
			System.out.println("Current Balance :"+acc[idx].balance);
			if(acc[idx].accType.equals("salary"))
			{
				SalaryAccount.transCount();
			}
		}
		public static void main(String[] args) {
		
		String accType;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Create Account\n2.Withdraw Money\n3.Deposit Money\n4.Calculate Interest\n5.Daily Report\n6.Close Account\n7.Exit");
		Account[] acc=new Account[100];
		int i=0;
		while(i==0)
		{ 
			System.out.println("Enter Your Choice :");
			int ch;
			ch=sc.nextInt();
			switch(ch)
			{
			case 1: 
				creatMyAccount(acc);
				break;
			case 2:
				withdrawMyMoney(acc);
				break;
			case 3:
				depositMyMoney(acc);
				break;
			case 4:
				break;
			
			default:
				break;
			}
		}
		
		
	
		sc.close();
	}

		
}
