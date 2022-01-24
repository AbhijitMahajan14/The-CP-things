class DivisibleBySum {
	public static void main(String[] args) {
		// Implement your code here
		int n=2250;
		int r;
		int sum=0;
		int temp=n;
		while(n>0)
		{
		    r=n%10;
		    sum=sum+r;
		    n=n/10;
		}
		if(temp%sum==0)
		{
		    System.out.print("Yes");
		}
		
	}
}
