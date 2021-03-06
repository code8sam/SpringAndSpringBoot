package org.bluetree.employeeassignment.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.bluetree.employeeassignment.dao.EmployeeDataBaseOperations;
import org.bluetree.employeeassignment.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/employee")
public class EmployeeController
{
	
	@Autowired
	private EmployeeDataBaseOperations operations;
	
	@RequestMapping(path="/getEmps", method=RequestMethod.GET)
	public String dispalyEmployeesPage(Model model)
	{
		List<Employee> allEmps = operations.getAllEmployees();
		model.addAttribute("allEmployees",allEmps);
		
		return "displayEmployee";
	}
	
	@RequestMapping("/insertPage")
	public String getInsertPage()
	{
		return "insertEmployee";
	}
	
	@RequestMapping(path="/insert", method=RequestMethod.POST)
	public String insertEmployee(Employee emp)
	{
		String dob = emp.getDob();
		int year = Integer.parseInt(dob.split("-")[0]);
		int age = LocalDate.now().getYear() - year;
		emp.setAge(age);
		
		if(operations.insertEmployee(emp))
		{
			return "sucess";
		}
		else
		{
			return "insertPage";
		}
	}
}
