

import java.util.Scanner;

public class Account {
	int acctNo;
	String acctName;
	float balance;
	
	Account(int acctNo, String acctName, float balance)
	{
		this.acctNo=acctNo;
		this.acctName=acctName;
		this.balance=balance;
	}
	
	private void depositMoney(int money)
	{
		this.balance=this.balance+money;
	}
	private float getBalance()
	{
		return this.balance;
	}
	
	
	public static void main(String args[])
	{	
		System.out.println("Menu :");
		System.out.println("0.Exit ");
		System.out.println("1.Create Account:");
		System.out.println("2.Add Money:");
		System.out.println("3.check balance:");
		int i=0;
		while(i==0)
		{
			System.out.println("Enter Your Choice :");
			Scanner c= new Scanner(System.in);
			int ch=c.nextInt();
			if(ch==0)
			{
				break;
			}
			else if(ch==1)
			{
				int acc=c.nextInt();
				String name=c.nextLine();
				int balance=c.nextInt();
				Account a= new Account(acc,name,balance);	
			}
			else if(ch==2)
			{
				System.out.println("Enter Deposit Money :");
				int rupee=c.nextInt();
				a.depositMoney(rupee);
			}
			else if(ch==3)
			{
				System.out.println("Your Balance :",a.getBalance());
				
			}
		}
		
		
	}
}
