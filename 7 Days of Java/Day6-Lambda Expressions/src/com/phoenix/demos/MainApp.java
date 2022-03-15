package com.phoenix.demos;

import java.util.ArrayList;

public class MainApp {
public static void main(String[] args) {
	ArrayList <Person>listPerson=new ArrayList();
	listPerson.add(new Person("Abhijit",22.0f,'M'));
	listPerson.add(new Person("Tanmay",22.0f,'M'));
	listPerson.add(new Person("Sumit",22.0f,'M'));
	
	Criteria checkCriteria=(listPerson1)->{		
		for(Person i:listPerson1)
		{
			if(i.age>18&&i.gender=='M')
			{
				System.out.println(i.name);
			}
		}
		
	};
	checkCriteria.checkCriteria(listPerson);
}
}
