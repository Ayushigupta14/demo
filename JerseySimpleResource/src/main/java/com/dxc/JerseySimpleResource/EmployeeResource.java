package com.dxc.JerseySimpleResource;

import java.util.ArrayList;
import java.util.Iterator;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dxc.model.Employee;
import com.dxc.services.EmployeeService;

@Path("employee")
public class EmployeeResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Employee> getAll()
	{
		EmployeeService.oninit();
		//String output="";
		ArrayList<Employee> s=EmployeeService.employees;
		//Iterator<Employee> it=s.iterator();
		//while(it.hasNext())
		//{
			//Employee emp=(Employee)it.next();
			//output+="Name = "+emp.getName()+"\nEmployee Id = "+emp.getEmpid()+"\n"+
			//"Department = "+emp.getDepartment()+"\nSalary = "+emp.getSalary()+
			//"\n\n";
		//}
		return s;
	}
	
	@GET
	@Path("maxsal")
	@Produces(MediaType.TEXT_PLAIN)
	public int getMax()
	{
		int salary=EmployeeService.getMaxSalary();
		return salary;
	}
	
	@POST
	@Path("add")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String getMax(Employee emp)
	{
		EmployeeService.employees.add(emp);
		return "Done";
	}

}
