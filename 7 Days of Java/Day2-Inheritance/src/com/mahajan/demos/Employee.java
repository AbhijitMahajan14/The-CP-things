package com.mahajan.demos;

public class Employee {
	int empId;
	String empName;
	float salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int v1,String v2,float v3)
	{
		empId=v1;
		empName=v2;
		salary=v3;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void CalSal() {
		// TODO Auto-generated method stub
		System.out.println("salary method");
	}
}
