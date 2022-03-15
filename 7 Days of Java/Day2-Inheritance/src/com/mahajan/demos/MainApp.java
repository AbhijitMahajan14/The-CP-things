package com.mahajan.demos;

public class MainApp {
	public static void main(String[] args) {
		Employee ref=new Employee();
		Trainee ref2=new Trainee(1,"Abhi",3.0f,44);
		System.out.println(ref2.empName);
		ref2.attendence();
	}
}
