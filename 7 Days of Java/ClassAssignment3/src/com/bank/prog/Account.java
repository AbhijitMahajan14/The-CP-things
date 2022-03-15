package com.bank.prog;

public class Account {
	String accName;
	float balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public void setName(String name)
	{
	     try { char[] chars = name.toCharArray();
	      for(char c:chars)
	      {
	    	  if(Character.isDigit(c))
	    	  {
	    		  throw new DigitInName("Name should not contain digits !");
	    	  }
	      }
	     }
	     catch(DigitInName d)
	     {
	    	 System.out.println(d.getMessage());
	     }
	}
	public void setBalance(float bal)
	{
		try {
			if(bal<0)
			{
				throw new NeativeBalance("Balance should not -ve");
			}
			else
			{
				balance=bal;
			}
		}
		catch(NeativeBalance n)
		{
			System.out.println(n.getMessage());
		}
	}
	public void withdraw(float amount)
	{
		try {
			if(amount<0)
			{
			throw new NegativeAmount("Amount should be +ve!");
			}
			else {
			balance=balance-amount;
			}
		}
		catch(NegativeAmount e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void deposit(float amount) throws NegativeAmount//,SampleException,SampleException2
	{
		
			try{if(amount<0)
			{
			throw new NegativeAmount("Amount 4444 should be +ve!");
			}
			else {
			balance=balance+amount;
			}
		}
			catch(NegativeAmount e)
			{
				System.out.println(e.getMessage());
			}
		
		
	}
}



