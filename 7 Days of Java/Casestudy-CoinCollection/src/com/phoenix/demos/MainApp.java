//package com.phoenix.demos;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class MainApp {
//	public static void main(String[] args) {
//		ArrayList<Coin>myCollection=new ArrayList();
//		System.out.println("1.Add Coin\n2.Search Coin\n3.Exit");
//		Scanner sc=new Scanner(System.in);
//		while(true)
//		{
//			System.out.println("Enter your choice :");
//			int ch=sc.nextInt();
//			switch(ch) 
//			{
//			case 1:
//					System.out.println("Enter Coutry :");
//					String cntry=sc.next();
//					
//					System.out.println("Enter domination :");
//					float dmntn=sc.nextFloat();
//					
//					System.out.println("Enter Minting Year :");
//					int mntng=sc.nextInt();
//					
//					System.out.println("Enter Value :");
//					float val=sc.nextFloat();
//					
//					System.out.println("Enter Date of Aquriring :");
//					String dt=sc.next();	
//					
//					Coin c=new Coin(cntry,dmntn,mntng,val,dt);
//					myCollection.add(c);
//					
//					break;
//			case 2:
//				
//					System.out.println("1.List by Country\n2.Search by Year of Minting\n3.Search by Current Value");
//					int ch3=sc.nextInt();
//					switch(ch3)
//					{
//					case 1:
//						System.out.println("Enter Coutry :");
//						String cn=sc.next();
//						listByCountry(cn,myCollection);
//						break;
//					case 2:
//						System.out.println("Enter Year :");
//						int year=sc.nextInt();
//						listByYear(year,myCollection);
//						break;
//					case 3:
//						listByValue(myCollection);
//						break;
//					case 4:
//						break;
//					}
//					break;
//			case 3:
//				String c1=sc.next();
//				searchByCountry(c1,myCollection);
//			case 4:
//				break;
//			}
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//	}
//
//	private static void listByValue(ArrayList<Coin> myCollection) {
//		// TODO Auto-generated method stub
//		myCollection.sort((o1, o2)
//                -> o1.getValue().compareTo(
//                    o2.getValue()));
//		for(Coin i:myCollection)
//		{
//			showDetails(i);
//		}
//		
//	}
//
//	private static void listByYear(int year, ArrayList<Coin> myCollection) {
//		// TODO Auto-generated method stub
//		for(Coin i:myCollection)
//		{
//			if(i.minting==year)
//			{
//				showDetails(i);
//			}
//		}
//		
//	}
//
//	private static void listByCountry(String c,ArrayList<Coin> myCollection) {
//		for(Coin i:myCollection)
//		{
//			if(i.country.equals(c))
//			{
//				showDetails(i);
//			}
//		}
//	}
//
//	private static void searchByCountry(String c, ArrayList<Coin> myCollection) {
//		// TODO Auto-generated method stub
//		for(Coin i:myCollection)
//		{
//			if(i.country.equals(c))
//			{
//				showDetails(i);
//			}
//		}
//		
//	}
//
//	private static void showDetails(Coin i) {
//		// TODO Auto-generated method stub
//		System.out.println("----------------------------------------------------------");
//		System.out.println("Coutry :"+i.country);
//		System.out.println("domination :"+i.domination);
//		System.out.println("Minting Year :"+i.minting);
//		System.out.println("Value :"+i.value);
//		System.out.println("Aquiring Date :"+i.date);
//		System.out.println("----------------------------------------------------------");
//		
//	}
//
//	
//}

package com.phoenix.demos;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) throws IOException {
		ArrayList<Coin>myCollection=new ArrayList();
		System.out.println("1.Add Coin\n2.Upload coin file\n3.List Coin\n4.Search Coin\n5.Exit");
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter your choice :");
			int ch=sc.nextInt();
			switch(ch) 
			{
			case 1:
					System.out.println("Enter Country :");
					String cntry=sc.next();
					
					System.out.println("Enter domination :");
					float dmntn=sc.nextFloat();
					
					System.out.println("Enter Minting Year :");
					int mntng=sc.nextInt();
					
					System.out.println("Enter Value :");
					float val=sc.nextFloat();
					
					System.out.println("Enter Date of Aquriring :");
					String dt=sc.next();	
					
					Coin c=new Coin(cntry,dmntn,mntng,val,dt);
					myCollection.add(c);
					
					break;
					
			case 2:
				
				try {
					String line = "";  
					String splitBy = ",";  
					BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Abhijit.Mahajan\\eclipse-workspace\\Casestudy-CoinCollection\\src\\com\\phoenix\\demos\\coin.csv"));
					while ((line = br.readLine()) != null)   
					{  
					String[] coinDetails = line.split(splitBy);  
					Coin c1=new Coin(coinDetails[0],Float.parseFloat(coinDetails[1]),Integer.parseInt(coinDetails[2]),Float.parseFloat(coinDetails[3]),coinDetails[4]);
					myCollection.add(c1);
					}					
					
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
				break;
				
				
				
				
				
			case 3:
				
					System.out.println("1.List by Country\n2.List by Year of Minting\n3.List by Current Value");
					int ch3=sc.nextInt();
					switch(ch3)
					{
					case 1:
						System.out.println("Enter Coutry :");
						String cn=sc.next();
						listByCountry(cn,myCollection);
						break;
					case 2:
						System.out.println("Enter Year :");
						int year=sc.nextInt();
						listByYear(year,myCollection);
						break;
					case 3:
						listByValue(myCollection);
						break;
					case 4:
						break;
					}
					break;
			case 4:
				System.out.println("1.Search by Country+Denomination\n2.Search by Country+Year of Minting\n3.Search by Country+Denomination+Year of Minting\n4.Search by Acquired Date+Country");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter Country :");
					String con=sc.next();
					System.out.println("Enter Denomination :");
					float deno=sc.nextFloat();
					CountryPlusDenom(con,deno,myCollection);
					break;
				case 2:
					System.out.println("Enter Country :");
					String con1=sc.next();
					System.out.println("Enter year of minting :");
					float mint=sc.nextFloat();
					CountryPlusMint(con1,mint,myCollection);
					break;
				case 3:
					System.out.println("Enter Country :");
					String con11=sc.next();
					System.out.println("Enter Denomination :");
					float deno1=sc.nextFloat();
					System.out.println("Enter year of minting :");
					float mint1=sc.nextFloat();
					CountryPlusMintDeno(con11,deno1,mint1,myCollection);
					break;
				case 4:
					break;
				}
			case 5:
				break;
			}
		}
			
		
	}

	private static void CountryPlusMintDeno(String con11, float deno, float mint1, ArrayList<Coin> myCollection) {
		// TODO Auto-generated method stub
		for(Coin i:myCollection)
		{
			if(i.country.equals(con11)&&i.minting==mint1&&i.domination==deno)
			{
				showDetails(i);
			}
		}
	}

	private static void CountryPlusMint(String con1, float mint, ArrayList<Coin> myCollection) {
		// TODO Auto-generated method stub
		for(Coin i:myCollection)
		{
			if(i.country.equals(con1)&&i.minting==mint)
			{
				showDetails(i);
			}
		}
	}

	private static void CountryPlusDenom(String con, float deno, ArrayList<Coin> myCollection) {
		// TODO Auto-generated method stub
		for(Coin i:myCollection)
		{
			if(i.country.equals(con)&&i.domination==deno)
			{
				showDetails(i);
			}
		}
	}

	private static void listByValue(ArrayList<Coin> myCollection) {
		// TODO Auto-generated method stub
		myCollection.sort((o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		for(Coin i:myCollection)
		{
			showDetails(i);
		}
		
	}

	private static void listByYear(int year, ArrayList<Coin> myCollection) {
		// TODO Auto-generated method stub
		for(Coin i:myCollection)
		{
			if(i.minting==year)
			{
				showDetails(i);
			}
		}
		
	}

	private static void listByCountry(String c,ArrayList<Coin> myCollection) {
		for(Coin i:myCollection)
		{
			if(i.country.equals(c))
			{
				showDetails(i);
			}
		}
	}

	private static void searchByCountry(String c, ArrayList<Coin> myCollection) {
		// TODO Auto-generated method stub
		for(Coin i:myCollection)
		{
			if(i.country.equals(c))
			{
				showDetails(i);
			}
		}
		
	}

	private static void showDetails(Coin i) {
		// TODO Auto-generated method stub
		System.out.println("----------------------------------------------------------");
		System.out.println("Coutry :"+i.country);
		System.out.println("domination :"+i.domination);
		System.out.println("Minting Year :"+i.minting);
		System.out.println("Value :"+i.value);
		System.out.println("Aquiring Date :"+i.date);
		System.out.println("----------------------------------------------------------");
		
	}

	
}

