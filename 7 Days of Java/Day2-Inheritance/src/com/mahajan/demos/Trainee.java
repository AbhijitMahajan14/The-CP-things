package com.mahajan.demos;

public class Trainee extends Employee{
	int trainingPeriod;
	
	
	public Trainee(int v1,String v2,float v3,int v4) {
		
		// TODO Auto-generated constructor stub
		super(v1,v2,v3);
		trainingPeriod=v4;
	}
	
	void attendence() {
		// TODO Auto-generated method stub
		System.out.println("Attendece Markd!");
	}
}
