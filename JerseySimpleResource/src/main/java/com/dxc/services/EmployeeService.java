package com.dxc.services;

import java.util.ArrayList;

import com.dxc.model.Employee;

public class EmployeeService {
	public static ArrayList <Employee> employees=new ArrayList<Employee>();
	
	public static void oninit()
	{
		
		employees.add(new Employee("Rishabh","CS12","Computer Science",45000));
		employees.add(new Employee("Supriya","MCA2","MCA",50000));
		employees.add(new Employee("Ankit","EC1","Electronics Communication",35000));
		employees.add(new Employee("Raveena","IT84","Information Technaology",43000));
		employees.add(new Employee("Pawan","EE75","Electronics",40000));
		//employees.add(new Employee());
		
	}
	
	public static ArrayList<Employee> getAllList()
	{
		return employees;
	}
	
	public static Employee getByEmpid(String empid)
	{
		Employee found=null;
		for(int i=0;i<employees.size();i++)
		{
			if(employees.get(i).getEmpid().equals(empid))
			{
				found=employees.get(i);
				break;
			}
		}
		return found;
	}
	
	public static Employee getByDepartment(String dept)
	{
		Employee found=null;
		for(int i=0;i<employees.size();i++)
		{
			if(employees.get(i).getDepartment().equals(dept))
			{
				found=employees.get(i);
				break;
			}
		}
		return found;
	}
	
	public static int getMaxSalary()
	{
		int salary=employees.get(0).getSalary();
		for(int i=1;i<employees.size();i++)
		{
			if(employees.get(i).getSalary()>salary)
			{
				salary=employees.get(i).getSalary();
				
			}
		}
		return salary;
	}
	

}
