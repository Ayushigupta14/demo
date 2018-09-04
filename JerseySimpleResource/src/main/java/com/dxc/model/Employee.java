package com.dxc.model;

public class Employee {
	
	String name;
	String empid;
	String department;
	int salary;
	
	public Employee()
	{
		
	}
	
	public Employee(String name, String empid, String department, int salary)
	{
		this.department=department;
		this.name=name;
		this.salary=salary;
		this.empid=empid;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
