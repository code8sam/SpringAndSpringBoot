package org.jspiders.curdoperationsusingmvc.service;

import java.time.LocalDate;
import java.util.List;

import org.jspiders.curdoperationsusingmvc.dao.EmployeeOperations;
import org.jspiders.curdoperationsusingmvc.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService
{
	@Autowired
	private EmployeeOperations operations;
	
	public List<Employee> displayAllEmployee()
	{
		return operations.getAllEmployees();
	}

	public void addemployee(Employee emp) 
	{
		String dob = emp.getDob();
		
		int yob = Integer.parseInt(dob.split("-")[0]);
		int curYear = LocalDate.now().getYear();
		int age = curYear - yob;
		
		emp.setAge(age);
		
		operations.insertEmployee(emp);
		
	}
}
